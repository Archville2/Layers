package by.htp.lesson05.task01.view;

import java.util.Scanner;

import by.htp.lesson05.task01.controller.Controller;

public class MainClass {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		String response;
		String task;

		System.out.println("Введите выражение. Например 3/5 + 2/1");
		
		while (true) {
			task = scanner.nextLine();
			response = controller.executetask(task);
			System.out.println(task + " = " + response);
		}

	}

}
