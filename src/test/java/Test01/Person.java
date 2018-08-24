package Test01;

public class Person {
	private int age;
	private String name;
	private int length;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Person() {
		super();
	}
	public Person(int age,String name,int length) {
		this.age = age;
		this.name = name;
		this.length = length;
	}
	public String toString() {
		return "name:"+this.name+", age:"+this.age+", length:"+this.length;
	}
}
