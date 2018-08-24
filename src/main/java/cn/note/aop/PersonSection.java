package cn.note.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonSection {
	
	@Before("execution(* cn.note.aop.*.eat(..))")
	public void beforeEat() {
		//System.out.println("加入点");
		System.out.println("吃东西前洗手");
	}
	
	@After("execution(* cn.note.aop.*.eat(..))")
	public void afterEat() {
		System.out.println("吃东西后要喝水");
	}
	
	@Before("execution(* cn.note.aop.*.sleep(..))")
	public void beforeSleep() {
		System.out.println("睡觉前洗澡");
	}
	
	@AfterReturning(value="execution(* cn.note.aop.*.eat(..))",returning="result")
	public void afterEat(Object result) {
		System.out.println("吃东西后要喝水");
		System.out.println(result);
	}
	
	@Before(value="cn.note.aop.PointCutsOfPerson.aopPerson()")
	public void beforeHaveLunch(JoinPoint joinpoint) {
		System.out.println("午饭前");
	}
}
