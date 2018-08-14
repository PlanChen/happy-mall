// 自定义接口调用服务名（请求前缀）
var baseURL = "/commodity/Api/";

$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'commodity/commodity/list',
        datatype: "json",
        mtype: 'POST',
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '商品标题', name: 'title', index: 'title', width: 80 }, 			
			{ label: '商品卖点', name: 'sellPoint', index: 'sell_point', width: 80 }, 			
			{ label: '市场价', name: 'marketPrice', index: 'market_price', width: 80 }, 			
			{ label: '零售价格', name: 'retailPrice', index: 'retail_price', width: 80 }, 			
			{ label: '库存数量', name: 'num', index: 'num', width: 80 }, 			
			{ label: '商品条形码', name: 'barcode', index: 'barcode', width: 80 }, 			
			{ label: '商品图片', name: 'image', index: 'image', width: 80 }, 			
			{ label: '所属类目，叶子类目', name: 'cid', index: 'cid', width: 80 }, 			
			{ label: '商品状态，1-正常，2-下架，3-删除', name: 'status', index: 'status', width: 80 }, 			
			{ label: '是否热销，0-否，1-是', name: 'isHot', index: 'is_hot', width: 80 }, 			
			{ label: '重量', name: 'weight', index: 'weight', width: 80 }, 			
			{ label: '颜色', name: 'colour', index: 'colour', width: 80 }, 			
			{ label: '尺寸', name: 'size', index: 'size', width: 80 }, 			
			{ label: '创建时间', name: 'created', index: 'created', width: 80 }, 			
			{ label: '更新时间', name: 'updated', index: 'updated', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		commodity: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.commodity = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.commodity.id == null ? "commodity/commodity/save" : "commodity/commodity/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.commodity),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "commodity/commodity/delete",
                    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "commodity/commodity/info/"+id, function(r){
                vm.commodity = r.commodity;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});