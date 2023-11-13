
package tr.com.huseyinaydin.sqrt.xml.advice;

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
//		System.out.println("- in Kesilen metodun öncesinde çalışacak metot. -");
//	}
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("- in Kesilen metodun öncesinde çalışacak metot. -");
		System.out.println("Kesilen metodun adı: " + method.getName());
		System.out.println("Kesilen metodun içinde bulunduğu sınıfın adı: " + target.getClass().getName());
		Double number = (Double) args[0];
		System.out.println("Kesilen metodun parametreleri: " + number);
		System.out.println("Argument: " + number);
		System.out.println("- in Kesilen metodun öncesinde çalışacak metot bitimi. Bitti.! -");
	}
}