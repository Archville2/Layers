package by.htp.lesson05.task01.service.multiply;

import by.htp.lesson05.task01.bean.Fraction;

public class MultiplyFractions {
	public String execute(Fraction one, Fraction two) {
		String result;
		int numerator = 1;
		int denominator = 1;

		numerator = one.getNumerator() * two.getNumerator();
		denominator = one.getDenominator() * two.getDenominator();

		result = numerator + "/" + denominator;

		return result;
	}
}
