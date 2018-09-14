layui.use(['form','layer','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //用户列表
    var tableIns = table.render({
        elem: '#userList',
        url : '/page/user/list',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 6,
        id : "userListTable",
        cols : [[
            {type: "checkbox",field:'usersId', fixed:"left", width:50},
            {field: 'userName', title: '用户名', minWidth:100, align:"center"},
            {field: 'userEmail', title: '用户邮箱', minWidth:200, align:'center',templet:function(d){
                return '<a class="layui-blue" href="mailto:'+d.userEmail+'">'+d.userEmail+'</a>';
            }},
            {field: 'userSex', title: '用户性别', align:'center'},
            {field: 'userStatus', title: '用户状态',  align:'center',templet:function(d){
                return d.userStatus == "0" ? "正常使用" : "限制使用";
            }},
            {field: 'userGrade', title: '用户等级', align:'center',templet:function(d){
                if(d.userGrade == "0"){
                    return "注册会员";
                }else if(d.userGrade == "1"){
                    return "中级会员";
                }else if(d.userGrade == "2"){
                    return "高级会员";
                }else if(d.userGrade == "3"){
                    return "钻石会员";
                }else if(d.userGrade == "4"){
                    return "超级会员";
                }
            }},
            {field: 'userEndTime', title: '最后登录时间', align:'center',minWidth:150},
            {title: '操作', minWidth:175, templet:'#userListBar',fixed:"right",align:"center"}
        ]]
    });


    $(".search_btn").on("click",function(){
        if($(".searchVal").val() != ''){
            table.reload("userListTable",{
                page: {
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                    key: $(".searchVal").val(),  //搜索的关键字
                    //pass:$(".searchVal").val()//累加即可
                }
            })
        }else{
            layer.msg("请输入搜索的内容");
        }
    });



    //添加用户
    function addUser(edit){
        var index = layui.layer.open({
            title : "添加用户",
            type : 2,
            content : "/page/user/userAdd",
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                if(edit){
                    body.find(".usersId").val(edit.usersId);  //用户ID
                    body.find(".userName").val(edit.userName);  //登录名
                    body.find(".userEmail").val(edit.userEmail);  //邮箱
                    body.find(".userSex input[value="+edit.userSex+"]").prop("checked","checked");  //性别
                    body.find(".userGrade").val(edit.userGrade);  //会员等级
                    body.find(".userStatus").val(edit.userStatus);    //用户状态
                    body.find(".userDesc").text(edit.userDesc);    //用户简介
                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回用户列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            }
        })
        layui.layer.full(index);
        window.sessionStorage.setItem("index",index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize",function(){
            layui.layer.full(window.sessionStorage.getItem("index"));
        })
    }
    $(".addNews_btn").click(function(){
        addUser();
    })

//批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('userListTable'),
            data = checkStatus.data,
            newsId = [];
        var ids = "";
        if(data.length > 0) {
            for (var i in data) {
               ids += data[i].usersId+",";
                //newsId.push(data[i].usersId);
            }
            layer.confirm('确定删除选中的用户？', {icon: 3, title: '提示信息'}, function (index) {
                $.get("/page/user/deleteUser",{
                    ids : ids  //将需要删除的newsId作为参数传入
                },function(data){
                    if(data.status == 200) {
                        parent.layer.msg('删除成功！', {icon: 1,time:1500,shade:0.2});
                        tableIns.reload();
                        layer.close(index)
                    }else {
                        parent.layer.msg('删除失败！', {icon: 2,time:2000,shade:0.2});
                    }
                })
            })
        }else{
            layer.msg("请选择需要删除的用户");
        }
    })

    //列表操作
    table.on('tool(userList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;
        var flag="";
        if(layEvent === 'edit'){ //编辑

            addUser(data);
        }else if(layEvent === 'usable'){ //启用禁用
            flag= data.userStatus;
            if(flag=="0"){
                usableText = "是否确定禁用此用户？";
            }else {
                usableText = "是否确定启用此用户？";
            }
            // var _this = $(this),
            //     usableText = "是否确定禁用此用户？",
            //     //  btnText = "已禁用";
            //     flag = "1";
            // if(_this.text()=="已禁用"){
            //     usableText = "是否确定启用此用户？",
            //         //btnText = "已启用";
            //         flag="0";
            // }
            layer.confirm(usableText,{
                icon: 3,
                title:'系统提示',
                cancel : function(index){
                    layer.close(index);
                }
            },function(index){
                $.get("/page/user/changeStatus",{
                    ids : data.usersId,  //将需要删除的newsId作为参数传入
                    flag:flag
                },function(data){
                    if(data.status == 200) {
                        parent.layer.msg('禁用成功！', {icon: 1,time:1000,shade:0.2});
                        tableIns.reload();
                        layer.close(index)
                    }else {
                        parent.layer.msg('禁用失败！', {icon: 2,time:2000,shade:0.2});
                    }
                })

            },function(index){
                layer.close(index);
            });
        }else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除此用户？',{icon:3, title:'提示信息'},function(index){

                $.get("/page/user/deleteUser",{
                    ids : data.usersId  //将需要删除的newsId作为参数传入
                },function(data){
                    if(data.status == 200) {
                        parent.layer.msg('删除成功！', {icon: 1,time:1500,shade:0.2});
                        tableIns.reload();
                        layer.close(index)
                    }else {
                        parent.layer.msg('删除失败！', {icon: 2,time:2000,shade:0.2});
                    }
                })
            });
        }
    });

})
