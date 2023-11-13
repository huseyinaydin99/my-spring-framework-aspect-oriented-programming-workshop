package tr.com.huseyinaydin.sqrt.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tr.com.huseyinaydin.sqrt.aspectJ.advice.ex.NegativeParameterException;
import tr.com.huseyinaydin.sqrt.contract.SqrtCalculator;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class SqrtAOPExample {

	public static void main(String[] args) throws NegativeParameterException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("/tr/com/huseyinaydin/sqrt/xml/resources/beans.xml");

		SqrtCalculator calculator = (SqrtCalculator) ctx.getBean("mathProxy");
		double sqrt = calculator.calculate(2);
		System.out.println(sqrt);

		System.out.println();
		
		calculator = (SqrtCalculator) ctx.getBean("newtonRaphsonProxy");
		sqrt = calculator.calculate(2);
		System.out.println(sqrt);
	}
}