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

public class NegativeParameterCheckerAdvice {

	public void doAdvice(JoinPoint jp, double number) throws NegativeParameterException {
		System.out.println("NegativeParameterCheckerAdvice: " + jp.getTarget().getClass().getName() + " ve ilgili kesilen metodun imzası " + jp.getSignature()
				+ " metodun parametreleri " + number);
		if (number < 0)
			throw new NegativeParameterException(number);
		var now = LocalDateTime.now();
		System.out.println("Tarih: " + now);
	}
}
