package tr.com.huseyinaydin.greeting.aspectJ.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
public class AroundAspect {
	
//	@Around("execution(* *.greet(..))")
//	@Around("execution(* *.*(..))")
//	@Around("execution(* *.*(..)) && !execution(* tr.com.huseyinaydin.greeting.aspectJ.conf.AspectConfig.*(..)) && !execution(* tr.com.huseyinaydin.greeting.aspectJ.conf.BeanConfig.*(..))")
//	@Around("execution(* *.*(..)) && !execution(* tr.com.huseyinaydin.greeting.aspectJ.conf.AspectConfig.*(..))")
//	@Around("execution(* tr.com.huseyinaydin.greeting.aspectJ.impl.Hello.greet(..))")
//	@Around("execution(* tr.com.huseyinaydin.greeting.aspectJ.impl.Hello.greet(..)) || execution(* tr.com.huseyinaydin.greeting.aspectJ.impl.Selam.greet(..)) || execution(* tr.com.huseyinaydin.greeting.aspectJ.impl.arabic.ArabicGreeter.greet(..))")
//	@Around("within(tr.com.huseyinaydin.greeting.aspectJ.impl.*)")
//	@Around("within(tr.com.huseyinaydin.greeting.aspectJ.impl.*) || within(tr.com.huseyinaydin.greeting.aspectJ.impl.arabic.*)")
//	@Around("within(tr.com.huseyinaydin.greeting.aspectJ.impl.*) || within(tr.com.huseyinaydin.greeting.aspectJ.impl.arabic.*) || within(tr.com.huseyinaydin.greeting.aspectJ.impl.farEast.*)")
//	@Around("execution(* tr.com.huseyinaydin.greeting.aspectJ.impl.Hello.greet(..)) || execution(* tr.com.huseyinaydin.greeting.aspectJ.impl.Selam.greet(..)) && !execution(* tr.com.huseyinaydin.greeting.aspectJ.impl.arabic.ArabicGreeter.greet(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("\nAroundAspect: kesilen metot " + joinPoint.getSignature().getName() + "() argümanları " + Arrays.toString(joinPoint.getArgs()));
		try {
			Object result = joinPoint.proceed();
			System.out.println("AroundAspect: kesilen metot " + joinPoint.getSignature().getName() + "() kesilen metodun geriye dönderdiği değer yahut referans [" + result + "]");
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
			throw e;
		}
	}
}