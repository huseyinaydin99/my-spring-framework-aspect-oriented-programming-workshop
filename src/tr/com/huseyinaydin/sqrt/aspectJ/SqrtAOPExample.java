package tr.com.huseyinaydin.sqrt.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tr.com.huseyinaydin.sqrt.aspectJ.advice.ex.NegativeParameterException;
import tr.com.huseyinaydin.sqrt.aspectJ.domain.Counter;
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

	public static void main(String[] args) throws NegativeParameterException, InterruptedException {
//		run0();
//		run1();
		run2();
//		run3();
	}

	public static void run0() throws NegativeParameterException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/tr/com/huseyinaydin/sqrt/aspectJ/resources/beans.xml");

		SqrtCalculator calculator = (SqrtCalculator) ctx.getBean("mathTarget");
		double sqrt = 0;
		sqrt = calculator.calculate(2);
		System.out.println(sqrt);

		calculator = (SqrtCalculator) ctx.getBean("newtonRaphsonTarget");
		sqrt = calculator.calculate(2);
		System.out.println(sqrt);
	}

	public static void run1() throws NegativeParameterException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/tr/com/huseyinaydin/sqrt/aspectJ/resources/beans.xml");

		SqrtCalculator calculator = (SqrtCalculator) ctx.getBean("mathTarget");
		double sqrt = 0;
		sqrt = calculator.calculate(2);
		System.out.println(sqrt + "\n");

		calculator = (SqrtCalculator) ctx.getBean("newtonRaphsonTarget");
		sqrt = calculator.calculate(12);
		System.out.println(sqrt);
	}

	public static void run2() throws NegativeParameterException, InterruptedException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/tr/com/huseyinaydin/sqrt/aspectJ/resources/beans.xml");

		SqrtCalculator calculator = (SqrtCalculator) ctx.getBean("mathTarget");
		double sqrt = 0;
		sqrt = calculator.calculate(2);
		System.out.println(sqrt + "\n");

		calculator = (SqrtCalculator) ctx.getBean("newtonRaphsonTarget");
		sqrt = calculator.calculate(2);
		System.out.println(sqrt);

		System.out.println();

		Counter counter = ctx.getBean(Counter.class);
		counter.start();
		Thread.sleep(1_000);
		counter.setFlag(false);
		System.out.println("\nToplam sayı: " + counter.getCount());
		System.out.println("\nToplam sayı: " + counter.getCount());
	}

	public static void run3() throws NegativeParameterException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/tr/com/huseyinaydin/sqrt/aspectJ/resources/beans.xml");

		SqrtCalculator calculator = (SqrtCalculator) ctx.getBean("mathTarget");
		double sqrt = 0;
		sqrt = calculator.calculate(-2);
		System.out.println(sqrt + "\n");

		calculator = (SqrtCalculator) ctx.getBean("newtonRaphsonTarget");
		sqrt = calculator.calculate(-2);
		System.out.println(sqrt);
	}
}