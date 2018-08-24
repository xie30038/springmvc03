package Test01;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.note.aop.American;
import cn.note.aop.Chinese;
import cn.note.aop.PersonSection;
import cn.note.aop.PointCutsOfPerson;
import cn.note.dao.NoteBookDao;
import cn.note.dao.UserDao;
import cn.note.entity.NoteBook;
import cn.note.entity.User;
import cn.note.util.Md5Pwd;

public class TestDemo01 {

	public static void main(String[] args) {
		//testMd5();
		//testAddUser();
		//testFindNoteBook();
		testChineseAop();
		
	}
	private static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	//private static ClassPathXmlApplicationContext ctxx = new ClassPathXmlApplicationContext("spring-mvc.xml");
	private static UserDao ud = ctx.getBean("userDao",UserDao.class);
	private static NoteBookDao nd = ctx.getBean("noteBookDao",NoteBookDao.class);
	private static Logger logger = LogManager.getLogger(TestDemo01.class);
	//private static PersonSection ps = ctx.getBean("personSection",PersonSection.class); 
	private static American amer = ctx.getBean("american",American.class);
	private static Chinese chi = ctx.getBean("chinese",Chinese.class);
	private static PointCutsOfPerson pc = ctx.getBean("pointCutsOfPerson",PointCutsOfPerson.class);
	//private static UserDao ud1 = 
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
	public static void testFindNoteBook() {
		List<NoteBook> list = nd.findAllNoteBook();
		for(NoteBook notebook : list) {
			logger.info("打印日志本"+notebook.toString());
			//System.out.println(notebook.toString());
		}
	}
	public static void testMybatis() throws IOException {
		String resource = "sqlMapConfig.xml";           // 定位核心配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);    // 创建 SqlSessionFactory
        
        SqlSession sqlSession = sqlSessionFactory.openSession();    // 获取到 SqlSession
        
        UserDao ud = (UserDao) new SqlSessionFactoryBuilder().build(inputStream);
        
        // 调用 mapper 中的方法：命名空间 + id
        List<Person> personList = sqlSession.selectList("yeepay.payplus/mapper.UserMapper.findAll");
	}
	public static void testChineseAop() {
		chi.eat();
		chi.haveBreakfast();
		chi.haveLunch();
		chi.haveSupper();
		chi.sleep();
		chi.eat("好吃的");
		chi.haveLunch();
		pc.aopPerson();
	}
	
	
}
