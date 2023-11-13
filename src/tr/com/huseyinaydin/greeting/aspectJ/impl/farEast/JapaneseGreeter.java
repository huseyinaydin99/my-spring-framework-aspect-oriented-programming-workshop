package tr.com.huseyinaydin.greeting.aspectJ.impl.farEast;

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

public class JapaneseGreeter implements Greeter{
	String selamInJapanese = "\u4eca\u65e5\u306f\u4e16\u754c";

	@Override
	public String greet(String name) throws NotGoodNameException {
		if(!name.equals("Miho"))
			throw new NotGoodNameException("Gardaş bu kötü bir Caponca isimdir lütfen iyi bir tane girivir Miho gibi (-: | :-D !" + name);
		return selamInJapanese + ' ' + name;
	} 
}