
package tr.com.huseyinaydin.sqrt.aspectJ.advice;

import java.time.LocalDateTime;
import org.aspectj.lang.JoinPoint;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class Log{	
	public void doAdvice(JoinPoint jp, double number, double result) throws Throwable {
		System.out.println("INFO: " + jp.getTarget().getClass().getName() + " ve metot imzası " + jp.getSignature() + " metodun parametreleri " + number + " ve return ettiği değer " + result);
		var now = LocalDateTime.now();
		System.out.println("Tarih ve saat: " + now);
	}
}