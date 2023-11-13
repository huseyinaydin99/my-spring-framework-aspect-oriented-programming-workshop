package tr.com.huseyinaydin.greeting.basic;

import org.springframework.aop.framework.ProxyFactory;

import tr.com.huseyinaydin.greeting.basic.advice.*;
import tr.com.huseyinaydin.greeting.basic.contract.Greeter;
import tr.com.huseyinaydin.greeting.basic.impl.*;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework AOP.
 * 
 */

public class GreeterAOPExample {

	public static void main(String[] args) {
		Greeter target = new Selam();
//		Greeter target = new Hello();

//		runTarget(target);
		runBeforeAdvice(target);
//		runAfterAdvice(target);
//		runAroundAdvice(target);
	}

	public static void runTarget(Greeter target) {
		target.greet();
	}

	public static void runBeforeAdvice(Greeter target) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new BeforeAdvice());
		factory.setTarget(target);
		Greeter proxy = (Greeter) factory.getProxy();
		proxy.greet();
	}

	public static void runAfterAdvice(Greeter target) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new AfterAdvice());
		factory.setTarget(target);
		Greeter proxy = (Greeter) factory.getProxy();
		proxy.greet();
	}

	public static void runAroundAdvice(Greeter target) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new AroundAdvice());
		factory.setTarget(target);
		Greeter proxy = (Greeter) factory.getProxy();
		proxy.greet();
	}
}