
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

public class TimingAdviceWithParameter{
	
	public Object doAdvice(ProceedingJoinPoint pjp, double number) throws Throwable {
		System.out.println("TimingAdviceWithParameter: " + pjp.getTarget().getClass().getName() + " kesilen metodun imzası " + pjp.getSignature() + " kesilen metodun aldığı parametreler " + number);
		Instant start = Instant.now();
		Object returnedValue = pjp.proceed(); 
		Instant end = Instant.now();
		long ns = Duration.between(start, end).toNanos();
		System.out.println("Metotun toplamda çalışma süresinin nano saniye türünden süresi: " + ns + " ns.");
		return returnedValue;
	}
}