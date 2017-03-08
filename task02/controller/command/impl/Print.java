package by.htp.lesson05.task02.controller.command.impl;

import by.htp.lesson05.task02.controller.command.Command;
import by.htp.lesson05.task02.service.factory.ServiceFactory;
import by.htp.lesson05.task02.service.impl.PrintService;

public class Print implements Command {

	@Override
	public String execute(String text) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		PrintService printService = serviceFactory.getPrintService();

		response = printService.print(text);
		
		return response;
	}

}
