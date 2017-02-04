package by.htp.lesson05.task01.service.common;

public class ReduceFraction {

	GetValues getValues = new GetValues();

	public String reduceFraction(String fraction) {
		int temp = 0;
		String result;
		boolean isEqual = false;

		int numerator = getValues.numerator(fraction);
		int denominator = getValues.denominator(fraction);
		int numeratorTemp = numerator;
		int denominatorTemp = denominator;

		if (numerator < denominator) {
			temp = Math.abs(numerator);
		} else {
			temp = denominator;
		}

		do {
			numerator = numeratorTemp % temp;
			denominator = denominatorTemp % temp;
			temp--;

			if (denominator == 0 && numerator == 0) {
				isEqual = true;
			}
		} while (!isEqual);

		numerator = (numeratorTemp / (temp + 1));
		denominator = (denominatorTemp / (temp + 1));

		if (numerator == denominator) {
			result = numerator + "";
		} else {
			result = numerator + "/" + denominator;
		}

		return result;
	}

}
