package by.htp.lesson05.task01.service.impl;

import by.htp.lesson05.task01.bean.Fraction;
import by.htp.lesson05.task01.service.MultiplyService;
import by.htp.lesson05.task01.service.common.GetValues;
import by.htp.lesson05.task01.service.common.ReduceFraction;
import by.htp.lesson05.task01.service.multiply.MultiplyFractions;

public class MultiplyServiceImpl implements MultiplyService {
	

	@Override
	public String multiply(String fractionOne, String fractionTwo) {
		ReduceFraction reduce = new ReduceFraction();
		MultiplyFractions multiplyFractions = new MultiplyFractions();
		GetValues getValues = new GetValues();
		Fraction one = new Fraction();
		Fraction two = new Fraction();
				
		String result;
		
		one.setNumerator(getValues.numerator(fractionOne));
		one.setDenominator(getValues.denominator(fractionOne));
		two.setNumerator(getValues.numerator(fractionTwo));
		two.setDenominator(getValues.denominator(fractionTwo));

		result = multiplyFractions.execute(one, two);
		result = reduce.reduceFraction(result);

		return result;
	}

}
