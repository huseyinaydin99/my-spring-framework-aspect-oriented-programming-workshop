package tr.com.huseyinaydin.sqrt.aspectJ.advice.ex;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class NegativeParameterException extends Exception{
	private static String message = "Eksi sayı girildi dayı: ";
	
	public NegativeParameterException(double number) {
		super(message + number);
	}
}