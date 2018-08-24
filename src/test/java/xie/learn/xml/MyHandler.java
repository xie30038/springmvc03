package xie.learn.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.sasl.SaslException;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{
	//存储正在解析的元素的数据
	 private Map<String,String> map=null;
	//存储所有解析的元素的数据
	 private List<Map<String,String>> list=null;
	//正在解析的元素的名字
	String currentTag=null;
	//正在解析的元素的名字
	String currentValue=null;
    //开始解析的元素
	String nodeName=null;
	
	public MyHandler(String nodeName) {
		this.nodeName = nodeName;
	}
	public List<Map<String,String>> getList(){
		return list;
	}
	@Override
	public void startDocument() throws SAXException{
		System.out.println("-----开始解释-----");
		list = new ArrayList<Map<String,String>>();
	}
	@Override
	public void startElement(String uri,String localName,String qName,Attributes attr) {
		if(qName.equals(nodeName)) {
			map = new HashMap<String, String>();
		}
		if(attr!=null&&map!=null) {
			for(int i = 0;i<attr.getLength();i++) {
				map.put(attr.getQName(i), attr.getValue(i));
			}
		}
		currentTag=qName;
		
	}
	//解释到每个元素的内容会调用此方法
	@Override
	public void characters(char[] ch, int start,int length) throws SAXException{
		System.out.println("=======characters======");
		if(currentTag!=null&&map!=null) {
			currentValue = new String(ch,start,length);
			if(currentValue!=null&&!currentValue.trim().equals("")&&!currentValue.trim().equals("\n")) {
				map.put(currentTag, currentValue);
				System.out.println("---------"+currentTag+" "+currentValue);
			}
			currentTag=null;
			currentValue=null;
		}
	}
	
	//每个元素结束时都会调用该方法
	@Override
	public void endElement(String uri,String localName,String qName) {
		System.out.println("------end------"+qName);
		if(qName.equals(nodeName)) {
			list.add(map);
			map=null;
		}
	}
	
	//结束解释文档，调用该方法
	@Override
	public void endDocument() throws SAXException{
		System.out.println("-----endDocu----");
		super.endDocument();
	}
	
	
	
	
}
