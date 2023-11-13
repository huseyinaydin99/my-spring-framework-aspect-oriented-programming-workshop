package tr.com.huseyinaydin.greeting.aspectJ.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import tr.com.huseyinaydin.greeting.aspectJ.contract.Greeter;
import tr.com.huseyinaydin.greeting.aspectJ.impl.*;
import tr.com.huseyinaydin.greeting.aspectJ.impl.arabic.ArabicGreeter;
import tr.com.huseyinaydin.greeting.aspectJ.impl.farEast.JapaneseGreeter;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework AOP.
 * 
 */

@Component
public class BeanConfig {
	@Bean(name = "helloGreeter")
	public Greeter getHelloGreeter() {
		Greeter greeter = new Hello();
		return greeter;
	}

	@Bean(name = "selamGreeter")
	public Greeter getSelamGreeter() {
		Greeter greeter = new Selam();
		return greeter;
	}

	@Bean(name = "arabicGreeter")
	public Greeter getArabicGreeter() {
		Greeter greeter = new ArabicGreeter();
		return greeter;
	}

	@Bean(name = "japaneseGreeter")
	public Greeter getJapaneseGreeter() {
		Greeter greeter = new JapaneseGreeter();
		return greeter;
	}
}