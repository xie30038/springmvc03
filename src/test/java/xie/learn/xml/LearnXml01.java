package xie.learn.xml;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Component;

public class LearnXml01 {

	public static void main(String[] args) {
		ArrayList<Map<String, String>> list=(ArrayList<Map<String, String>>) SaxService.ReadXML("../springmvc03/src/test/resources/learn01.xml","class");
		///springmvc03/src/test/resources/learn01.xml
		System.out.println(list.toString());
		//@Component
	}
}
