package tr.com.huseyinaydin.greeting.aspectJ.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import tr.com.huseyinaydin.greeting.aspectJ.advice.ex.NotGoodNameException;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

@Aspect
public class AfterThrowingAspect {
	
//	@AfterThrowing (pointcut = "execution(* *.greet(..))", throwing="ex")
	public void callAfterThrowingException(NotGoodNameException ex) throws Exception{
		System.out.println("Fırlatılan hata: " + ex);
	}
}