// 自定义接口调用服务名（请求前缀）
var baseURL = "/commodity/Api/";

$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'commodity/categoryimage/list',
        datatype: "json",
        mtype: 'POST',
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '分类id', name: 'cid', index: 'cid', width: 80 }, 			
			{ label: '名字', name: 'name', index: 'name', width: 80 }, 			
			{ label: '网址或网页id', name: 'url', index: 'url', width: 80 }, 			
			{ label: '状态。可选值:1(little),2(big)', name: 'littleOrBig', index: 'little_or_big', width: 80 }, 			
			{ label: '状态。可选值:1(正常),2(删除)', name: 'status', index: 'status', width: 80 }, 			
			{ label: '图片路径', name: 'imageUrl', index: 'image_url', width: 80 }, 			
			{ label: '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数', name: 'sortOrder', index: 'sort_order', width: 80 }, 			
			{ label: '', name: 'created', index: 'created', width: 80 }, 			
			{ label: '', name: 'updated', index: 'updated', width: 80 }			
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
		categoryImage: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.categoryImage = {};
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
			var url = vm.categoryImage.id == null ? "commodity/categoryimage/save" : "commodity/categoryimage/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.categoryImage),
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
				    url: baseURL + "commodity/categoryimage/delete",
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
			$.get(baseURL + "commodity/categoryimage/info/"+id, function(r){
                vm.categoryImage = r.categoryImage;
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