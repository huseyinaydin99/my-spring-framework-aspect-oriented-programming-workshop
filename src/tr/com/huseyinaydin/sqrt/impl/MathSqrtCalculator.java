package tr.com.huseyinaydin.sqrt.impl;

import tr.com.huseyinaydin.sqrt.aspectJ.advice.ex.NegativeParameterException;
import tr.com.huseyinaydin.sqrt.contract.SqrtCalculator;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class MathSqrtCalculator implements SqrtCalculator{
	@Override
	public double calculate(double number) throws NegativeParameterException {
		//if(number < 0)
		//	throw new NegativeParameterException(number);
		return Math.sqrt(number);
	}
}