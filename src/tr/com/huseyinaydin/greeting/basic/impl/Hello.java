package tr.com.huseyinaydin.greeting.basic.impl;

import tr.com.huseyinaydin.greeting.basic.contract.Greeter;

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class Hello implements Greeter{
	@Override
	public void greet() {
		System.out.println("Hello");
	}
}