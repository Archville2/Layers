package by.htp.lesson05.task01.service.add;

import by.htp.lesson05.task01.bean.Fraction;

public class AddFractions {

	public String execute(Fraction one, Fraction two) {
		String result = null;
		int numerator;
		int denominator;

		numerator = one.getNumerator() + two.getNumerator();
		denominator = one.getDenominator();

		result = numerator + "/" + denominator;

		return result;
	}
}
