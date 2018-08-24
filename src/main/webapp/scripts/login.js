//用户登录界面js脚本文件
//登录页面加载时执行的函数
var SUCCESS = 0;
var ERROR = 1;
var us = {};
$(function(){
	//点击事件，用户登录
	$('#login').click(loginAction);
	//焦点失去，用户名检验
	$('#count').focus().blur(checkUserName);
	//焦点失去，密码检验
	//表单校验插件 validate()
	$('#password').blur(checkPassword);
	//用户注册时用户名检验
	$('#regist_username').blur(checkRegName);
	//点击注册，用户完成注册
	$('#regist_button').click(registerAction);
	
	
});

//用户登录函数
function loginAction(){
	var url = 'user/login.do';
	var name = $('#count').val();
	var pwd = $('#password').val();
	var data = {name:name,password:pwd};
	$.post(url,data,function(result){
		var sts = result.state;
		if(sts == 0){
			//获取用户名信息
			var user = result.data;
			us = result.data;
			console.log(user);
			//跳转到笔记页面  通过?+...传参数
			//可以使用cookie保存数据。
			SetCookie('userId',user.userId);
			//window.localStorage.setItem("lastname", user.userName);
			localStorage.name = user.name;
			localStorage.userId = user.userId;
			localStorage.password = user.password;
			location.href='edit.html';
			
		}else if(sts == 2 || sts == 3 || sts == 4){
			$('#count_msg').empty().html(result.message).css({"color":"red"});
		}else if(sts == 6 || sts == 7 || sts == 8 || sts == 9){
			$('#password_msg').empty().html(result.message).css({'color':'red'});
		}else{
			alert(result.message);
		}
	});
}

//检验用户名函数
function verName(userName,filedId){
	if(!userName){
		//count_msg
		$(filedId).empty().html('用户名不能为空').css({"color":"red"});
		return false;
	}
	var reg = /^\w{5,50}$/ ;
	if(reg.test(userName)){
		$(filedId).empty();
		return true;
	}else{
		$(filedId).empty().html('5-50个字符').css({"color":"red"});
		return false;
	}
}


//用户名检验函数
function checkUserName(){
	var userName = $('#count').val();
	verName(userName,'#count_msg');
}

//密码检验函数
function checkPassword(){
	var pwd = $('#password').val();
	if(!pwd){
		$('#password_msg').empty().html('密码不能为空').css({'color':'red'});
		return false;
	}
	var reg = /^\w{3,20}$/;
	if(reg.test(pwd)){
		$('#password_msg').empty();
		return true;
	}else{
		$('#password_msg').empty().html('3-20个字符').css({'color':'red'});
		return false;
	}
}

//用户注册函数
function registerAction(){
	var name = $('#regist_username').val();
	var nick = $('#nickname').val();
	var pwd = $('#regist_password').val();
	var conf = $('#final_password').val();
	var url = 'user/register.do';
	var data = {name:name,password:pwd,conf:conf,nick:nick,};
	$.post(url,data,function(result){
		var sts = result.state;
		if(sts == SUCCESS){
			var user = result.date;
			$('#back').click();
			$('#count').val(user.userName);
			$('#count_msg').empty();
			$('#password_msg').empty();
			$('#password').focus();
		}else if(sts == 2 || sts == 3 || sts == 4 || sts == 5){
			$('#warning_1').empty().html(result.message);
			$('#warning_1').show();
		}else if(sts == 6 || sts == 7 || sts == 8){
			$('#warning_2').empty().html(result.message);
			$('#warning_2').show();
		}else{
			alert(result.message)
		}
	});
	
	
}

//用户注册时用户名检验
function checkRegName(){
	var name = $('#regist_username').val();
	//校验注册用户名称
	if(!verName(name,'#ver_name')){
		//禁用按钮
		$('#regist_button').attr('disabled','true');
		return;
	}
	//请求路径
	var url = 'user/verifyname.do';
	//请求参数
	var data = {name:name};
	$.get(url,data,function(result){
		var sts = result.state;
		if(sts==0){
			$('#ver_name').empty().html('用户名不可用').css({'color':'red'});
			$('#regist_button').attr('disabled','true');
			return;
		}
		if(sts==3){
			$('#ver_name').empty().html('用户名不能为空').css({'color':'red'});
			$('#regist_button').attr('disabled','true');
			return false;
		}
		//状态2位用户名可用
		if(sts==2){
			//ver_name
			$('#ver_name').empty().html('用户名可用').css({'color':'green'});
			$('#regist_button').attr('disabled','false');
			return true;
		}
	});
	
}









