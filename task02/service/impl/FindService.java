package by.htp.lesson05.task02.service.impl;

import by.htp.lesson05.task02.dao.CommandsDAO;
import by.htp.lesson05.task02.dao.factory.DAOFactory;

public class FindService {
	
	public String find(String text) {
		String result;

		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		CommandsDAO commandsDAO = daoObjectFactory.getCommandsService();

		result = commandsDAO.find(text);

		return result;
	}
}
