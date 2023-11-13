
package tr.com.huseyinaydin.greeting.basic.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class BeforeAdvice implements MethodBeforeAdvice{

//	@Override
//	public void before(Method method, Object[] args, Object target) throws Throwable {
//		System.out.print("Zeynep ");
//	}
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.err.println("Kesilen metot öncesi başlangıcıdır.");
		System.err.println("Kesilen metodun adıdır: " + method.getName());
		System.err.println("Kesilen metodun içinde bulunduğu sınıfın adı: " + target.getClass().getName());
		int length = args.length;
		System.err.println("Kesilen metodun " + length + " kadar argümanları var.");
		System.err.println("Kesilen metodun öncesinin bitişi.");
		System.err.println("Kesilen metodun start edilişi run....");
	}
}