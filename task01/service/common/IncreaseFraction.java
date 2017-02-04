package by.htp.lesson05.task01.service.common;

import by.htp.lesson05.task01.bean.Fraction;

public class IncreaseFraction {
	public void execute(Fraction fraction, int commonDenominator) {
		int multiplier = commonDenominator / fraction.getDenominator();

		fraction.setNumerator(multiplier * fraction.getNumerator());
		fraction.setDenominator(commonDenominator);

	}

}
