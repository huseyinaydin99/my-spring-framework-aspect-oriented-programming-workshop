package tr.com.huseyinaydin.greeting.aspectJ.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import tr.com.huseyinaydin.greeting.aspectJ.advice.*;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework AOP.
 * 
 */

@Component
public class AspectConfig {

	@Bean(name = "aroundAspect")
	public AroundAspect getAroundAspect() {
		AroundAspect logAspect = new AroundAspect();
		return logAspect;
	}

	@Bean(name = "beforeAspect")
	public BeforeAspect getBeforeAspect() {
		BeforeAspect beforeAspect = new BeforeAspect();
		return beforeAspect;
	}

	@Bean(name = "afterAspect")
	public AfterAspect getAfterAspect() {
		AfterAspect afterAspect = new AfterAspect();
		return afterAspect;
	}

	@Bean(name = "afterThrowingAspect")
	public AfterThrowingAspect getAfterThrowingAspect() {
		AfterThrowingAspect afterThrowingAspect = new AfterThrowingAspect();
		return afterThrowingAspect;
	}
}