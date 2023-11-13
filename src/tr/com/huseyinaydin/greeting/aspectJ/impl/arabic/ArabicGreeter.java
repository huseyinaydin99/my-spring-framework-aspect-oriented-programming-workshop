package tr.com.huseyinaydin.greeting.aspectJ.impl.arabic;

import tr.com.huseyinaydin.greeting.aspectJ.contract.Greeter;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class ArabicGreeter implements Greeter{
	private String selamInArabic = "\u0633\u0644\u0627\u0645";

	@Override
	public String greet(String name) {
		return selamInArabic + ' ' + name;
	}
}