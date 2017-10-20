package Test01;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.note.dao.UserDao;
import cn.note.entity.User;
import cn.note.util.Md5Pwd;

public class TestDemo01 {

	public static void main(String[] args) {
		//testMd5();
		testAddUser();
		
	}
	private static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	private static UserDao ud = ctx.getBean("userDao",UserDao.class);
	public static void testMd5() {
		String str = "123";
		System.out.println(Md5Pwd.EncrPwd(str));
	}
	public static void testAddUser() {
		String userId = UUID.randomUUID().toString();
		User u = new User();
		u.setUserId(userId);
		u.setName("xie30038");
		u.setPassword(Md5Pwd.EncrPwd("xpy123"));
		int t = ud.addUser(u);
		System.out.println(t);
	}
	
}
