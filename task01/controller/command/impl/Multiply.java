package by.htp.lesson05.task01.controller.command.impl;

import by.htp.lesson05.task01.controller.command.Command;
import by.htp.lesson05.task01.service.MultiplyService;
import by.htp.lesson05.task01.service.factory.ServiceFactory;

public class Multiply implements Command {

	@Override
	public String execute(String fractionOne, String fractionTwo) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		MultiplyService multiplyService = serviceFactory.getMultiplyService();

		response = multiplyService.multiply(fractionOne, fractionTwo);
		
		return response;
	}
}
