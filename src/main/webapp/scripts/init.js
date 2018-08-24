/*
 * 笔记信息页面初始化脚本
 */
var SUCCESS = 0
var ERROR = 1;
//业务信息对象
var model = {};
var name= window.localStorage.name;
$(function(){
	//console.log(localStorage.name);
	//console.log(localStorage.password);
	//console.log(localStorage.userId);
	loadNoteBooksAction();    //加载笔记本信息
	$('#notebooks').on('click','li',listNoteAction);    //点击笔记本执行的方法
	
	
	
	
});


