package by.htp.lesson05.task02.controller.command.impl;

import by.htp.lesson05.task02.controller.command.Command;
import by.htp.lesson05.task02.service.factory.ServiceFactory;
import by.htp.lesson05.task02.service.impl.DeleteService;

public class Delete implements Command {

	@Override
	public String execute(String text) {
		String response;

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		DeleteService deleteService = serviceFactory.getDeleteService();

		response = deleteService.delete(text);

		return response;
	}

}
