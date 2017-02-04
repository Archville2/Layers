package by.htp.lesson05.task01.service.common;

import by.htp.lesson05.task01.bean.Fraction;

public class FindCommonDenominator {

	public int execute(Fraction one, Fraction two) {
		int commonDenominator = one.getDenominator();
		int multipyDenominator = two.getDenominator();
		int multiplier = 1;
		boolean isEqual = false;

		if (commonDenominator > two.getDenominator()) {
			commonDenominator = two.getDenominator();
			multipyDenominator = one.getDenominator();
		}

		int tempDenominator = commonDenominator;

		do {
			commonDenominator = tempDenominator * multiplier;

			if (commonDenominator % multipyDenominator == 0) {
				isEqual = true;
			}
			multiplier++;

		} while (isEqual != true);

		return commonDenominator;
	}

}
