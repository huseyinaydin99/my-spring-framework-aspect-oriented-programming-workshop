
package tr.com.huseyinaydin.greeting.basic.advice;

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

public class AfterAdvice implements AfterReturningAdvice {

//	@Override
//	public void afterReturning(Object returnedValue, Method method, Object[] args, Object target) throws Throwable {
//		System.out.print(" Zeynep\n");
//	}

	@Override
	public void afterReturning(Object returnedValue, Method method, Object[] args, Object target) throws Throwable {
		System.err.println("\n- Kesilem metodun sonrası başlangıcı -");
		System.err.println("Kesilen metot adı: " + method.getName());
		System.err.println("Hedef sınıf adı: " + target.getClass().getName());
		int length = args.length;
		System.err.println("Kesilen metodun " + length + " kadar argümanları yani parametreleri var.");
		System.err.println("Kesilen metodun geriye return ettiği yani dönderdiği değer yahut referans: " + returnedValue);
		System.err.println("\n- Kesilem metodun sonrası bitişi -");
	}
}
