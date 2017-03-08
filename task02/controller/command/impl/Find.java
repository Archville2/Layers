package by.htp.lesson05.task02.controller.command.impl;

import by.htp.lesson05.task02.controller.command.Command;
import by.htp.lesson05.task02.service.factory.ServiceFactory;
import by.htp.lesson05.task02.service.impl.FindService;

public class Find implements Command {

	@Override
	public String execute(String text) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		FindService findService = serviceFactory.getFindService();

		response = findService.find(text);

		return response;
	}

}
