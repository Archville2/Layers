package by.htp.lesson05.task01.service.substract;

import by.htp.lesson05.task01.bean.Fraction;

public class SubstractFractions {

	public String execute(Fraction one, Fraction two) {
		String result;
		int numerator;
		int denominator;

		numerator = one.getNumerator() - two.getNumerator();
		denominator = one.getDenominator();

		result = numerator + "/" + denominator;

		return result;
	}
}
