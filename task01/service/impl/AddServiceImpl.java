package by.htp.lesson05.task01.service.impl;

import by.htp.lesson05.task01.service.AddService;
import by.htp.lesson05.task01.service.add.AddFractions;
import by.htp.lesson05.task01.service.common.FindCommonDenominator;
import by.htp.lesson05.task01.service.common.GetValues;
import by.htp.lesson05.task01.service.common.IncreaseFraction;
import by.htp.lesson05.task01.service.common.ReduceFraction;
import by.htp.lesson05.task01.bean.Fraction;

public class AddServiceImpl implements AddService {

	@Override
	public String add(String fractionOne, String fractionTwo) {
		ReduceFraction reduce = new ReduceFraction();
		FindCommonDenominator findCommonDenominator = new FindCommonDenominator();
		IncreaseFraction increaseFraction = new IncreaseFraction();
		AddFractions addFractions = new AddFractions();
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

		result = addFractions.execute(one, two);
		result = reduce.reduceFraction(result);

		return result;
	}

}
