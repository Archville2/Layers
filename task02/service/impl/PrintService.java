package by.htp.lesson05.task02.service.impl;

import by.htp.lesson05.task02.dao.CommandsDAO;
import by.htp.lesson05.task02.dao.factory.DAOFactory;

public class PrintService {

	public String print(String text) {
		String result;

		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		CommandsDAO commandsDAO = daoObjectFactory.getCommandsService();

		result = commandsDAO.print();

		return result;
	}
}
