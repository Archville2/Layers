package by.htp.lesson05.task01.controller.command.impl;

import by.htp.lesson05.task01.controller.command.Command;
import by.htp.lesson05.task01.service.SubstractService;
import by.htp.lesson05.task01.service.factory.ServiceFactory;

public class Substract implements Command {

	@Override
	public String execute(String fractionOne, String fractionTwo) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		SubstractService substractService = serviceFactory.getSubstractService();

		response = substractService.substract(fractionOne, fractionTwo);
		
		return response;
	}
}
