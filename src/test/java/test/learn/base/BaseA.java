package test.learn.base;

public class BaseA {
	private String id;
	private String name;
	private int status;
	protected int type;
	private static final boolean ERROR = false;
	private static final boolean SUCCESS = true;
	{
		this.status = 1;
		System.out.println("sts1");
	}
	public BaseA() {
		super();
		System.out.println("实例化一个A");
	}
	static {
		System.out.println("只加载一次A");
	}

}
