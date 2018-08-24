package xie.bank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		//读取属性文件a.properties
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader("../springmvc03/src/test/java/xie/bank/jdbc.properties"));
			prop.load(bufferedReader);
			System.out.println(prop.getProperty("jdbc.url"));
			System.out.println(prop.getProperty("dbcp.validationQuery"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
