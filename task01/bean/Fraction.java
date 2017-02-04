package by.htp.lesson05.task01.bean;

import java.io.Serializable;

public class Fraction implements Serializable {
	private static final long serialVersionUID = 1L;
	private int numerator;
	private int denominator;

	public Fraction() {
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

}
