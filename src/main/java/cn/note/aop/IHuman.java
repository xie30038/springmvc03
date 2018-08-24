package cn.note.aop;

import org.springframework.stereotype.Component;

@Component
public interface IHuman {
	void eat();
	void sleep();
	void haveBreakfast();
	void haveLunch();
	void haveSupper();
	String eat(String thing);
}
