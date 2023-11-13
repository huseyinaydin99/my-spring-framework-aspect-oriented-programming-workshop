
package tr.com.huseyinaydin.sqrt.xml.advice;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class AfterAdvice implements AfterReturningAdvice{

//	@Override
//	public void afterReturning(Object returnedValue, Method method, Object[] args, Object target) throws Throwable {
//		System.out.println("- in Kesilen metodun ardından çalışacak metot. -");
//	}
	
	@Override
	public void afterReturning(Object returnedValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("\n- Kesilen metodun ardından çalışacak metot. -");
		System.out.println("Kesilen metodun adı: " + method.getName());
		System.out.println("Kesilen metodun içinde bulunduğu sınıfın adı: " + target.getClass().getName());
		Double number = (Double) args[0];
		System.out.println("Kesilen metodun parametreleri: " + number);
		Double returnedDouble = (Double) returnedValue;
		System.out.println("Kesilen metodun geriye dönderdiği metot: " + returnedDouble);
		System.out.println("- in Kesilen metodun ardından çalışacak metotun bittiği yer. Bitti! -\n");
	}
}