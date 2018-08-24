package Test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;

import cn.note.dao.UserDao;

public class TestRefect01 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//testAgency02();
		testGetClass01();
		
	}
	public static <T>T getDemoBean(String name,Class<T> type) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		T t = (T)Class.forName(name).newInstance();
		Class c = t.getClass();
		Method m1 = c.getDeclaredMethod("setName",String.class);
		m1.invoke(t, "theeeg");
		return t;
	}
	public static void testReft() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person p1 = new Person(10,"谢晓君",162);
		//通过反射动态创建一个类
		Person c1 = (Person)Class.forName("Test01.Person").newInstance();    
		c1.setName("谢晓君");
		System.out.println(c1.getName());
		Class<?> demo01 = Class.forName("Test01.Person");
		//System.out.println(demo01.);
		//Map m = new HashMap<K, V>();
		Person p2 = getDemoBean("Test01.Person", Person.class);
		//p2.setName("xie30038");
		System.out.println(p2.getName());
	}
	public static void testAgen01() {
		Master m = new Master();
		m.runHello("谢晓君");
	}
	public static void testAgency02() {
		Agency a = (Agency)new AgentLine().getInstance(new Master());
		a.runHello("谢晓君");
	}
	public static void testGetClass01() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<Person> c1 = Person.class;   //类的类类型
		Person p = new Person(28, "xiexiaojun", 160);
		Class c2 = p.getClass();
		Person p3 = (Person) c1.newInstance();
		Person p4 = GetObject.getInstance(Person.class);
		p4.setName("xiexiaojun");
		System.out.println(p4.getName());
		Person p5 = GetObject.getInstance(Person.class, "xiexiaojun", 28, 160);
		System.out.println(p5.toString());
		
	}
	public static void testSqlSession() {
		//SqlSessionFactory sqlf = new SqlSessionFactoryBuilder().//获得一个sqlSession 
		//SqlSession sqls = new SqlSessionFactoryBuilder().build(reader)
		List<Person> l01 = new ArrayList<Person>();
		List<Person> l02 = new LinkedList<Person>();
		Map<String,Person> m01 = new HashMap<String, Person>();
		Map<String,Person> m02 = new TreeMap<String, Person>();
	}
	
}
