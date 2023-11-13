package tr.com.huseyinaydin.greeting.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import tr.com.huseyinaydin.greeting.aspectJ.advice.ex.NotGoodNameException;
import tr.com.huseyinaydin.greeting.aspectJ.contract.Greeter;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

@EnableAspectJAutoProxy
@ComponentScan({ "tr.com.huseyinaydin.greeting.aspectJ.contract", "tr.com.huseyinaydin.greeting.aspectJ.impl",
		"tr.com.huseyinaydin.greeting.aspectJ.conf" })
public class GreetingAOPExample {

	public static void main(String[] args) throws NotGoodNameException {
		ApplicationContext context = new AnnotationConfigApplicationContext(GreetingAOPExample.class);

		Greeter hello = (Greeter) context.getBean("helloGreeter");
		String greeting = hello.greet("Hüseyin");
		System.out.println(greeting);

		Greeter selam = (Greeter) context.getBean("selamGreeter");
		greeting = selam.greet("Yasin");
		System.out.println(greeting);

		Greeter arabic = (Greeter) context.getBean("arabicGreeter");
		greeting = arabic.greet("Rümeysa");
		System.out.println(greeting);

		Greeter japanesGereeter = (Greeter) context.getBean("japaneseGreeter");
		greeting = japanesGereeter.greet("Kenji");
		System.out.println(greeting);
	}
}