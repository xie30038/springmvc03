package test.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestProxyDemo01 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<PersonDao> c1 = PersonDao.class;
		Class<DefaultDao> c2 = DefaultDao.class;
		DefaultDao def = new DefaultDao();
		Method abtractMethod = c1.getDeclaredMethod("findByName", null);
		Method mthodDefault = c2.getDeclaredMethod("findByName", null);
		System.out.println(abtractMethod);
		System.out.println(mthodDefault);
		abtractMethod = mthodDefault;
		abtractMethod.invoke(def, null);    //执行方法
	}

}
