package tr.com.huseyinaydin.greeting.aspectJ.contract;

import tr.com.huseyinaydin.greeting.aspectJ.advice.ex.NotGoodNameException;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public interface Greeter {
	public String greet(String name) throws NotGoodNameException;
}