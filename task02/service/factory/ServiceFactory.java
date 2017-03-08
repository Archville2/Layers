package by.htp.lesson05.task02.service.factory;

import by.htp.lesson05.task02.service.impl.AddService;
import by.htp.lesson05.task02.service.impl.DeleteService;
import by.htp.lesson05.task02.service.impl.PrintService;
import by.htp.lesson05.task02.service.impl.FindService;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final AddService addService = new AddService();
	private final PrintService printService = new PrintService();
	private final FindService findService = new FindService();
	private final DeleteService deleteService = new DeleteService();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public AddService getAddService() {
		return addService;
	}

	public PrintService getPrintService() {
		return printService;
	}

	public FindService getFindService() {
		return findService;
	}
	
	public DeleteService getDeleteService() {
		return deleteService;
	}
}
