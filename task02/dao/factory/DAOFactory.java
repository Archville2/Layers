package by.htp.lesson05.task02.dao.factory;

import by.htp.lesson05.task02.dao.CommandsDAO;
import by.htp.lesson05.task02.dao.impl.ExeCommandsDAO;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final CommandsDAO commandsDAO = new ExeCommandsDAO();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public CommandsDAO getCommandsService() {
		return commandsDAO;
	}
}
