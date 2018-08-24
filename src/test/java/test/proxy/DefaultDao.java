package test.proxy;

import Test01.Person;

public class DefaultDao {

	public DefaultDao() {
		// TODO Auto-generated constructor stub
	}
	public Person findByName() {
		System.out.println("xiexiaojun");
		return new Person(); 
	}
}
