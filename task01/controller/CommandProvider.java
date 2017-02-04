package by.htp.lesson05.task01.controller;

import java.util.Map;
import java.util.HashMap;

import by.htp.lesson05.task01.controller.command.Command;
import by.htp.lesson05.task01.controller.command.impl.Add;
import by.htp.lesson05.task01.controller.command.impl.Divide;
import by.htp.lesson05.task01.controller.command.impl.Substract;
import by.htp.lesson05.task01.controller.command.impl.Multiply;

final class CommandProvider {
	private final Map<String, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put("+", new Add());
		repository.put("-", new Substract());
		repository.put("*", new Multiply());
		repository.put("/", new Divide());
	}

	Command getCommand(String name) {
		Command command;

		command = repository.get(name);

		return command;
	}

}
