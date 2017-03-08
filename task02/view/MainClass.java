package by.htp.lesson05.task02.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import by.htp.lesson05.task02.controller.Controller;

public class MainClass {
	public static void main(String[] args) {

		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		String response;
		String task;

		System.out.println("Enter text:");

		while (true) {
			task = scanner.nextLine();
			response = controller.executetask(task);
			System.out.println(response);
		}
	}
}
