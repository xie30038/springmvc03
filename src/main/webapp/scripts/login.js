//用户登录界面js脚本文件
//登录页面加载时执行的函数
var SUCCESS = 0;
var ERROR = 1;
$(function(){
	//点击事件，用户登录
	$('#login').click(loginAction);
	//焦点失去，用户名检验
	$('#count').focus().blur(checkUserName);
	//焦点失去，密码检验
	//表单校验插件 validate()
	$('#password').blur(checkPassword);
	//点击注册，用户完成注册
	$('#regist_button').click(registerAction);
	//用户注册时用户名检验
	$('#regist_username').blur(checkRegName);
	
});

//用户登录函数
function loginAction(){
	
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
		return;
	}
	var reg = /^w{3,20}$/;
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
	
}

//用户注册时用户名检验
function checkRegName(){
	var name = $('#regist_username').val();
	//校验注册用户名称
	if(!verName(name,'#ver_name')){
		return;
	}
	//请求路径
	var url = 'user/verifyname.do';
	//请求参数
	var data = {name:name};
	$.get(url,data,function(result){
		var sts = result.state;
		//状态2位用户名可用
		if(sts==2){
			//ver_name
			$('#ver_name').empty().html('用户名可用').css({'color':'green'});
			return;
		}
		if(sts==0){
			$('#ver_name').empty().html('用户名不可用').css({'color':'red'});
			return;
		}
	});
	
}









