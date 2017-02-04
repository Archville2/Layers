package by.htp.lesson05.task01.controller.command.impl;

import by.htp.lesson05.task01.controller.command.Command;
import by.htp.lesson05.task01.service.DivideService;
import by.htp.lesson05.task01.service.factory.ServiceFactory;

public class Divide implements Command {

	@Override
	public String execute(String fractionOne, String fractionTwo) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		DivideService divideService = serviceFactory.getDivideService();

		response = divideService.divide(fractionOne, fractionTwo);

		return response;
	}
}
