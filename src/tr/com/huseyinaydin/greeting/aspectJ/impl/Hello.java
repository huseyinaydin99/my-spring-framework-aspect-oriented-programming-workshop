package tr.com.huseyinaydin.greeting.aspectJ.impl;

import tr.com.huseyinaydin.greeting.aspectJ.contract.Greeter;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class Hello implements Greeter{

	@Override
	public String greet(String name) {
		return "Hello " + name;
	}
}