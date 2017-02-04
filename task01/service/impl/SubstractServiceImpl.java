package by.htp.lesson05.task01.service.impl;

import by.htp.lesson05.task01.service.SubstractService;
import by.htp.lesson05.task01.service.substract.SubstractFractions;
import by.htp.lesson05.task01.service.common.FindCommonDenominator;
import by.htp.lesson05.task01.service.common.GetValues;
import by.htp.lesson05.task01.service.common.IncreaseFraction;
import by.htp.lesson05.task01.service.common.ReduceFraction;
import by.htp.lesson05.task01.bean.Fraction;

public class SubstractServiceImpl implements SubstractService {

	@Override
	public String substract(String fractionOne, String fractionTwo) {
		ReduceFraction reduce = new ReduceFraction();
		FindCommonDenominator findCommonDenominator = new FindCommonDenominator();
		IncreaseFraction increaseFraction = new IncreaseFraction();
		SubstractFractions substractFractions = new SubstractFractions();
		GetValues getValues = new GetValues();
		Fraction one = new Fraction();
		Fraction two = new Fraction();

		String result;

		one.setNumerator(getValues.numerator(fractionOne));
		one.setDenominator(getValues.denominator(fractionOne));
		two.setNumerator(getValues.numerator(fractionTwo));
		two.setDenominator(getValues.denominator(fractionTwo));

		int commonDenominator = findCommonDenominator.execute(one, two);

		increaseFraction.execute(one, commonDenominator);
		increaseFraction.execute(two, commonDenominator);

		result = substractFractions.execute(one, two);
		result = reduce.reduceFraction(result);

		return result;
	}

}
