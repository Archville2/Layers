package by.htp.lesson05.task01.service.factory;

import by.htp.lesson05.task01.service.AddService;
import by.htp.lesson05.task01.service.SubstractService;
import by.htp.lesson05.task01.service.MultiplyService;
import by.htp.lesson05.task01.service.DivideService;
import by.htp.lesson05.task01.service.impl.AddServiceImpl;
import by.htp.lesson05.task01.service.impl.SubstractServiceImpl;
import by.htp.lesson05.task01.service.impl.MultiplyServiceImpl;
import by.htp.lesson05.task01.service.impl.DivideServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final AddService addService = new AddServiceImpl();
	private final SubstractService substractService = new SubstractServiceImpl();
	private final MultiplyService multiplyService = new MultiplyServiceImpl();
	private final DivideService divideService = new DivideServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public AddService getAddService() {
		return addService;
	}

	public SubstractService getSubstractService() {
		return substractService;
	}

	public MultiplyService getMultiplyService() {
		return multiplyService;
	}

	public DivideService getDivideService() {
		return divideService;
	}

}
