package tr.com.huseyinaydin.greeting.basic.impl;

import tr.com.huseyinaydin.greeting.basic.contract.Greeter;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class Selam implements Greeter{
	@Override
	public void greet() {
		System.out.print("Selam");
	}
}