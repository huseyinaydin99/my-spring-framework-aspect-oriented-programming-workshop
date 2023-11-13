package tr.com.huseyinaydin.greeting.aspectJ.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
public class AfterAspect {

//	@After("execution(* *.greet(..))")
	public void callAfter(JoinPoint joinPoint) {
		System.out.println();
		try {
			System.out.println(
					"AfterAspect: ilgili kesilen metot " + joinPoint.getSignature().getName() + "() argümanlara yani parametreleri " + Arrays.toString(joinPoint.getArgs()));
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument ex " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
			throw e;
		}
	}
}