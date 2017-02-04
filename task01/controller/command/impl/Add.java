package by.htp.lesson05.task01.controller.command.impl;

import by.htp.lesson05.task01.controller.command.Command;
import by.htp.lesson05.task01.service.AddService;
import by.htp.lesson05.task01.service.factory.ServiceFactory;

public class Add implements Command {

	@Override
	public String execute(String fractionOne, String fractionTwo) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		AddService addService = serviceFactory.getAddService();

		response = addService.add(fractionOne, fractionTwo);

		return response;
	}

}
