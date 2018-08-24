package Test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetObject {

	public GetObject() {
		// TODO Auto-generated constructor stub
	}
	public static <T> T getInstance(Class<T> c) throws InstantiationException, IllegalAccessException {
			return (T)c.newInstance();
	}
	public static <T> T getInstance(Class<T> c,String name,int age,int length) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//T t = (T)c.newInstance();
		Constructor<T> con = c.getConstructor(int.class,String.class,int.class);
		return con.newInstance(age,name,length);
	}
}
