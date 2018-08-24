/*
 * 笔记本相关脚本文件
 */ 

function loadNoteBooksAction(){
	var url = 'notebook/list.do';
	var data = {userId:localStorage.userId};
	$.getJSON(url,data,function(result){
		var sts = result.state;
		if(sts == SUCCESS){
			console.log(result.data);
			var notebook = result.data;
			model.updateNotebooksView(notebook);
		}
	});
}

model.updateNotebooksView = function(notebook){
	//把notebook存入model对象  
	this.notebook = notebook;  //等价于model.notebook = notebook;
	//清空ul，notebooks的ul
	var ul = $('#notebooks').empty();
	var temp = '<li class="online">'+
	         '<a>'+
	         '<i class="fa fa-book" title="online" rel="tooltip-bottom">'+
	         '</i> #{name}</a></li>';
	//遍历notebook对象，并显示
	for(var i = 0;i<this.notebook.length;i++){
		var notebook = this.notebook[i];
		var li = $(temp.replace('#{name}',notebook.noteBookName));
		//数据绑定
		li.data('index',i);
		ul.append(li);
	}
	
	
}
/*
 * <li class="online">
	<a  class='checked'>
	<i class="fa fa-book" title="online" rel="tooltip-bottom">
	</i> 默认笔记本</a></li>
 */




