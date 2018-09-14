layui.use(['form','layer'],function(){
    var form = layui.form
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery;

    form.on("submit(addUser)",function(data){
        //弹出loading
        var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
        //实际使用时的提交信息
        $.post("/page/user/saveUser",{
            usersId : $(".usersId").val(),  //登录ID 如为空则为新增
            userName : $(".userName").val(),  //登录名
            userEmail : $(".userEmail").val(),  //邮箱
            userSex : data.field.sex,  //性别
            userGrade : data.field.userGrade,  //会员等级
            userStatus : data.field.userStatus,    //用户状态
            newsTime : submitTime,    //添加时间
            userDesc : $(".userDesc").val(),    //用户简介
        },function(res){
            if(res.status == 200){
                top.layer.close(index);
                if(res.data == 'insert'){
                    top.layer.msg("用户插入成功！");
                }else if(res.data == 'update'){
                    top.layer.msg("用户更新成功！");
                }
                layer.closeAll("iframe");
                //刷新父页面
                parent.location.reload();
            }
        })
        // setTimeout(function(){
        //     top.layer.close(index);
        //     top.layer.msg("用户添加成功！");
        //     layer.closeAll("iframe");
        //     //刷新父页面
        //     parent.location.reload();
        // },2000);
        return false;
    })

    //格式化时间
    function filterTime(val){
        if(val < 10){
            return "0" + val;
        }else{
            return val;
        }
    }
    //定时发布
    var time = new Date();
    var submitTime = time.getFullYear()+'-'+filterTime(time.getMonth()+1)+'-'+filterTime(time.getDate())+' '+filterTime(time.getHours())+':'+filterTime(time.getMinutes())+':'+filterTime(time.getSeconds());

    $(".userName").blur(function() {
        checkUser();
    });
    function checkUser() {
        var name = $(".userName").val();
        $.ajax({
            type : "post",
            url : '/page/user/checkUserName',
            data : "name=" + name,
            success : function(res) {
                ine("name",res.data);
            }
        });
    }
    function ine(flag,data) {
        if(flag=="name"){
            if (data == 1) {
                document.getElementById("checkUN").innerHTML = "<b style='color: red'>用户名已存在,请重新输入</b>";
            } else if (data == 2) {
                document.getElementById("checkUN").innerHTML = "<b style='color:red'>不能为空</b>";
            } else if (data == 3) {
                document.getElementById("checkUN").innerHTML = "<b style='color:green'>该用户名可用</b>"
            } else if (data == 0) {
                document.getElementById("checkUN").innerHTML = "<b style='color:red'>ajax成功返回值为空</b>"
            } else {
                document.getElementById("checkUN").innerHTML = "<b style='color:red'>未知错误</b>"
            }
        }else if(flag == "email"){
            if (data == 1) {
                document.getElementById("checkEm").innerHTML = "<b style='color: red'>该邮箱已存在,请重新输入</b>";

            } else if (data == 2) {
                document.getElementById("checkEm").innerHTML = "<b style='color:red'>邮箱不能为空</b>";
            } else if (data == 3) {
                document.getElementById("checkEm").innerHTML = "<b style='color:green'>该邮箱名可用</b>"
            }else if(data == 4){
                document.getElementById("checkEm").innerHTML = "<b style='color:red'>该邮箱格式不正确,请输入正确格式</b>"
            }
        }

    }

    $(".userEmail").blur(function() {
        checkEmail();
    });

    function checkEmail() {
        var email = $(".userEmail").val();
        $.ajax({
            type : "post",
            url : '/page/user/checkEmail',
            data : "email=" + email,
            success : function(res) {
                ine("email",res.data);
            }
        });
    }

})