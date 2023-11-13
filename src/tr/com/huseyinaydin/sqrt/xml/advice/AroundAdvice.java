
package tr.com.huseyinaydin.sqrt.xml.advice;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("\n- in Kesilen metodun ardından çalışacak kısım. -");
		Instant start = Instant.now();
		Object returnedValue = invocation.proceed(); 
		System.out.println("Kesilen metodun sonrasında çalışacak kısım.");
		Instant end = Instant.now();
		long ns = Duration.between(start, end).toNanos();
		System.out.println("Period: " + ns + " ns.");
		System.out.println("- in Kesilen metodun sonrasında çalışacak kısım bitimi. Bitti!-\n");
		return returnedValue;
	}

//	@Override
//	public Object invoke(MethodInvocation invocation) throws Throwable {
//		System.out.println("- Oncesinde -\n");
//		Method method = invocation.getMethod();
//		System.out.println("Method: " + method.getName());
//		System.out.println("Target: " + invocation.getClass().getName());
//		Object[] args = invocation.getArguments();
//		Double number = (Double) args[0];
//		System.out.println("Argument: " + number);
//		
//		long start = System.currentTimeMillis();
//		
//		Object returnedValue = invocation.proceed(); 
//		
//		System.out.println("Returned value: " + returnedValue);
//		long end = System.currentTimeMillis();
//		System.out.println("\n- Sonrasinda -");
//		System.out.println("Sure: " + (end-start) + " ms.\n");
//		return returnedValue;
//	}
}