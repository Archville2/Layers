package by.htp.lesson05.task02.controller.command.impl;

import by.htp.lesson05.task02.service.impl.AddService;
import by.htp.lesson05.task02.service.factory.ServiceFactory;
import by.htp.lesson05.task02.controller.command.Command;

public class Add implements Command {

	@Override
	public String execute(String text) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		AddService addService = serviceFactory.getAddService();

		response = addService.add(text);

		return response;
	}

}
