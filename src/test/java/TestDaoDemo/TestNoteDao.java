package TestDaoDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;

import cn.note.dao.NoteBookDao;
import cn.note.dao.NoteDao;
import cn.note.entity.Note;
import cn.note.util.Page;

public class TestNoteDao {

	public static void main(String[] args) {
		//testFindAllNote();
		testFindNoteByUserId();
		//testSplitPage();
		//testFindNoteByPage();
		
	}
	//private static ClassPathXmlApplicationContext ctxs = new ClassPathXmlApplicationContext("spring-mvc.xml");
	private static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	private static NoteDao nd = ctx.getBean("noteDao",NoteDao.class);
	private static NoteBookDao nbd = ctx.getBean("noteBookDao",NoteBookDao.class);
	private static Logger logger = LogManager.getLogger(TestNoteDao.class);
	public static void testFindAllNote() {
		List<Note> list = nd.findAllNote();
		for(Note note : list) {
			//System.out.println(note.toString());
			logger.info("打印日志笔记"+note.toString());
		}
	}
	public static void testFindNoteByUserId() {
		PageHelper.startPage(2, 5);
		List<Note> list = nd.findNoteByUserId("39295a3d-cc9b-42b4-b206-a2e7fab7e77c");   //zhoujia的笔记
		for(Note note : list) {
			logger.info("打印日志笔记"+note.toString());
		}
	}
	public static void testSplitPage() {
		int pageNo = 1;
        int pageSize = 10;
        RowBounds bounds = new RowBounds((pageNo - 1) * pageSize, pageSize);
        Note note = new Note();
        
        //Page<Note> list = nd.pageByConditions(bounds, note);
	}
	public static void testFindNoteByPage() {
		Map<String, Object> data = new HashMap();
        data.put("currPage", 2);
        data.put("pageSize", 5);
        
	}
	
	
}
