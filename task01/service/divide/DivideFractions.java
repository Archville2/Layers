package by.htp.lesson05.task01.service.divide;

import by.htp.lesson05.task01.bean.Fraction;

public class DivideFractions {
	public String execute(Fraction one, Fraction two) {
		String result;
		int numerator;
		int denominator;

		numerator = one.getNumerator() * two.getDenominator();
		denominator = one.getDenominator() * two.getNumerator();

		result = numerator + "/" + denominator;

		return result;
	}
}
