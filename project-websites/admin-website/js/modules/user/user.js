// 自定义接口调用服务名（请求前缀）
var baseURL = "/user/Api/";

$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'user/user/list',
        datatype: "json",
        mtype: 'POST',
        colModel: [			
			{ label: 'userId', name: 'userId', index: 'user_id', width: 50, key: true, hidden: true },
			{ label: '用户名', name: 'username', index: 'username', width: 80 }, 			
			{ label: '昵称', name: 'nickname', index: 'nickname', width: 80 }, 			
			{ label: '手机号', name: 'mobile', index: 'mobile', width: 80 }, 			
			{ label: '邮箱', name: 'email', index: 'email', width: 80 }, 			
			{ label: '性别', name: 'gender', index: 'gender', width: 80, formatter: function(value, options, row){
                if(value == 0){ return '<span class="label label-info">男</span>'; }
                if(value == 1){ return '<span class="label label-success">女</span>'; }
            }},			
			{ label: '生日', name: 'birthday', index: 'birthday', width: 80 }, 			
			{ label: '用户级别', name: 'userLevelId', index: 'user_level_id', width: 80, formatter: function(value, options, row){
                if(value == 0){ return '<span class="label label-info">铜牌会员</span>'; }
                if(value == 1){ return '<span class="label label-success">银牌会员</span>'; }
                if(value == 2){ return '<span class="label label-warning">金牌会员</span>'; }
            }},					
			{ label: '注册ip', name: 'registerIp', index: 'register_ip', width: 80 }, 			
			{ label: '注册时间', name: 'registerTime', index: 'register_time', width: 80 }, 			
			{ label: '修改时间', name: 'updated', index: 'updated', width: 80 }			
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
		user: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.user = {};
		},
		update: function (event) {
			var userId = getSelectedRow();
			if(userId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(userId)
		},
		saveOrUpdate: function (event) {
			var url = vm.user.userId == null ? "user/user/save" : "user/user/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.user),
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
			var userIds = getSelectedRows();
			if(userIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "user/user/delete",
                    contentType: "application/json",
				    data: JSON.stringify(userIds),
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
		getInfo: function(userId){
			$.get(baseURL + "user/user/info/"+userId, function(r){
                vm.user = r.user;
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