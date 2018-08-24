package cn.note.aop;

import org.springframework.stereotype.Component;

@Component
public class American implements IHuman {

	public void eat() {
		System.out.println("美国人吃");
	}

	public void sleep() {
		System.out.println("美国人睡觉");
	}

	public void haveBreakfast() {
		System.out.println("美国人吃早餐");
	}

	public void haveLunch() {
		System.out.println("美国人吃午餐");
	}

	public void haveSupper() {
		System.out.println("美国人吃晚餐");
	}

	public String eat(String thing) {
		return "美国人吃东西"+thing;
	}

}
