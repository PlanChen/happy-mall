// 自定义接口调用服务名（请求前缀）
var baseURL = "/commodity/Api/";

$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'commodity/commodesc/list',
        datatype: "json",
        mtype: 'POST',
        colModel: [			
			{ label: 'commoId', name: 'commoId', index: 'commo_id', width: 50, key: true },
			{ label: '商品描述', name: 'commoDesc', index: 'commo_desc', width: 80 }, 			
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
		commoDesc: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.commoDesc = {};
		},
		update: function (event) {
			var commoId = getSelectedRow();
			if(commoId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(commoId)
		},
		saveOrUpdate: function (event) {
			var url = vm.commoDesc.commoId == null ? "commodity/commodesc/save" : "commodity/commodesc/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.commoDesc),
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
			var commoIds = getSelectedRows();
			if(commoIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "commodity/commodesc/delete",
                    contentType: "application/json",
				    data: JSON.stringify(commoIds),
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
		getInfo: function(commoId){
			$.get(baseURL + "commodity/commodesc/info/"+commoId, function(r){
                vm.commoDesc = r.commoDesc;
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