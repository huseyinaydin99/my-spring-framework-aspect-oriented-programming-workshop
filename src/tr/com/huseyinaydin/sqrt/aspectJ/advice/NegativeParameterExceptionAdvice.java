package tr.com.huseyinaydin.sqrt.aspectJ.advice;

import java.time.LocalDateTime;
import org.aspectj.lang.JoinPoint;

import tr.com.huseyinaydin.sqrt.aspectJ.advice.ex.NegativeParameterException;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class NegativeParameterExceptionAdvice{
	
	public void handleException(NegativeParameterException negativeParameterException) throws NegativeParameterException {
		System.out.println("\n" + NegativeParameterExceptionAdvice.class + " INFO: İstisna işlenmek üzere yakalandı!");
		System.out.println("İstisna mesajı: " + negativeParameterException.getMessage());
		var now = LocalDateTime.now();
		System.out.println("Tarih: " + now);
	}
}
