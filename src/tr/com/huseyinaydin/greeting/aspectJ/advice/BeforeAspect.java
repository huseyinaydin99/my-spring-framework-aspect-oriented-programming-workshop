package tr.com.huseyinaydin.greeting.aspectJ.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

@Aspect
public class BeforeAspect {

//	@Before("execution(* *.greet(..))")
	public void callBefore(JoinPoint joinPoint) {
		try {
			System.out.println("BeforeAspect: ilgili kesilen metot " + joinPoint.getSignature().getName() + "() argümanları " + Arrays.toString(joinPoint.getArgs()));
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
			throw e;
		}
		System.out.println();
	}
}