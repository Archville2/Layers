package by.htp.lesson05.task02.controller;

import java.util.Map;
import java.util.HashMap;

import by.htp.lesson05.task02.controller.command.Command;
import by.htp.lesson05.task02.controller.command.impl.Add;
import by.htp.lesson05.task02.controller.command.impl.Delete;
import by.htp.lesson05.task02.controller.command.impl.Print;
import by.htp.lesson05.task02.controller.command.impl.Find;

final class CommandProvider {
	private final Map<String, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put("ADD", new Add());
		repository.put("PRINT", new Print());
		repository.put("FIND", new Find());
		repository.put("DELETE", new Delete());
	}

	Command getCommand(String name) {
		Command command=null;

		name = (name.toUpperCase());
		command = repository.get(name);

		return command;
	}
}