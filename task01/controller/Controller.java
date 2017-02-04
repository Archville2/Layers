package by.htp.lesson05.task01.controller;

import by.htp.lesson05.task01.controller.command.Command;

public class Controller {
	private final CommandProvider provider = new CommandProvider();

	public String executetask(String command) {
		Command executionCommand;

		String[] commands = command.split(" ");

		if (commands.length != 3) {
			return "Error!";
		}

		String operation = commands[1];
		String fractionOne = commands[0];
		String fractionTwo = commands[2];

		executionCommand = provider.getCommand(operation);

		String response;

		response = executionCommand.execute(fractionOne, fractionTwo);

		return response;
	}

}
