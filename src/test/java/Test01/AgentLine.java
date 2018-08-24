package Test01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentLine implements InvocationHandler {
	private Agency agency;
	public AgentLine(Agency agency) {
		super();
		this.agency = agency;
	}
	public AgentLine() {
		super();
	}
	public Object getInstance(Agency agency) {
		this.agency = agency;
		Class c = agency.getClass();
		Object obj = Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), this);
		return obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理类");
		method.invoke(agency, args);
		System.out.println("代理完了");
		return null;
	}

}
