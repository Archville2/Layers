package by.htp.lesson05.task02.controller;

import by.htp.lesson05.task02.controller.command.Command;

public class Controller {
	private final CommandProvider provider = new CommandProvider();

	public String executetask(String message) {
		Command executionCommand;
		String text=null;
		String[] commands = message.split(" ");

		String operation = commands[0];
		if (commands.length > 1) {
			text = message.substring(operation.length()+1);
		}

		executionCommand = provider.getCommand(operation);
		if (executionCommand == null) {
			return "Wrong command!";
		}
		String response;

		response = executionCommand.execute(text);

		return response;
	}

}
