package tr.com.huseyinaydin.sqrt.aspectJ.advice;

import java.time.Duration;
import java.time.Instant;
import org.aspectj.lang.ProceedingJoinPoint;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class TimingAdvice{
	
	public Object doAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("TimingAdvice: " + pjp.getTarget().getClass().getName() + " kesilen metodun imzası " + pjp.getSignature());
		Instant start = Instant.now();
		Object returnedValue = pjp.proceed(); 
		Instant end = Instant.now();
		long ns = Duration.between(start, end).toNanos();
		System.out.println("Metodun toplamda çalışmış olduğu nano saniye: " + ns + " ns.");
		return returnedValue;
	}
}