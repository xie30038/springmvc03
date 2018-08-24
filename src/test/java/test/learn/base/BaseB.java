package test.learn.base;

public class BaseB extends BaseA {
	private int age;
	private String sex;
	private int length;
	public BaseB() {
		super();
		System.out.println("实例化一个B");
	}
	{
		this.sex = "N";
		System.out.println("sexN");
	}
	static {
		System.out.println("只加载一次B");
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}


/**
 * 静态块在类加载的时候执行，只执行一次
 * 初始化块在实例化的时候执行，每实例化一个对象就执行一次
 * 实例化子类时，先实例化父类，同时会先执行父类的初始化块，再执行父类的构造方法，然后执行子类的初始化块，最后执行子类的构造方法
 */




