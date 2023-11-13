package tr.com.huseyinaydin.sqrt.impl;

import tr.com.huseyinaydin.sqrt.contract.SqrtCalculator;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework AOP.
* 
*/

public class NewtonRaphsonSqrtCalculator implements SqrtCalculator{
	
	@Override
	public double calculate(double tFactorial) {
		if(tFactorial < 0)
			return Double.NaN;
		
		double x1 = 0;
		double x0 = tFactorial / 2;
		double a = tFactorial;
		boolean finished = false;

		while (finished == false) {
			x1 = (x0 + (a / x0)) / 2;
			if (x1 > x0) {
				if ((x1 - x0) < 0.00005) {
					finished = true;
				}
			} else if (x0 > x1) {
				if ((x0 - x1) < 0.00005) {
					finished = true;
				}
			}
			x0 = x1;
		}
		return x1;
	}
}