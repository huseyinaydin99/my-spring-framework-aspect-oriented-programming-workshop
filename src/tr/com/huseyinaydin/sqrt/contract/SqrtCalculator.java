package tr.com.huseyinaydin.sqrt.contract;

import tr.com.huseyinaydin.sqrt.aspectJ.advice.ex.NegativeParameterException;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public interface SqrtCalculator {
	public double calculate(double number) throws NegativeParameterException;
}