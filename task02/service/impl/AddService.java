package by.htp.lesson05.task02.service.impl;

import by.htp.lesson05.task02.dao.CommandsDAO;
import by.htp.lesson05.task02.dao.factory.DAOFactory;

public class AddService {

	public String add(String text) {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		CommandsDAO commandsDAO = daoObjectFactory.getCommandsService();
		
		commandsDAO.add(text);

		return null;

	}
}
