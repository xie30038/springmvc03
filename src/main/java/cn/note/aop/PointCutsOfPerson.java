package cn.note.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointCutsOfPerson {
	@Pointcut(value="within(cn.note.*)")
	public void aopPerson() {
		System.out.println("切入点");
	}
}
