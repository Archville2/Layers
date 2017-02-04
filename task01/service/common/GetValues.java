package by.htp.lesson05.task01.service.common;

public class GetValues {
	public int numerator(String values) {

		String[] fractionValues = values.split("/");
		int numerator = Integer.parseInt(fractionValues[0]);

		return numerator;
	}

	public int denominator(String values) {

		String[] fractionValues = values.split("/");
		int denominator = Integer.parseInt(fractionValues[1]);

		return denominator;
	}

}
