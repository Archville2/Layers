package by.htp.lesson05.task02.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import by.htp.lesson05.task02.dao.CommandsDAO;

public class ExeCommandsDAO implements CommandsDAO {

	@Override
	public void add(String text) {
		String filePath = "C://temp/noteBook.txt";
		BufferedWriter bufferWriter = null;

		try {
			FileWriter fileWriter = new FileWriter(filePath, true);
			bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write(text + "\n");
			bufferWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String print() {
		String text = "";

		try {
			File f = new File("C://temp/noteBook.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				text = text.concat(line);
				text = text.concat("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	@Override
	public void delete() {
		String filePath = "C://temp/noteBook.txt";
		BufferedWriter bufferWriter = null;

		try {
			File file = new File(filePath);
			bufferWriter = new BufferedWriter(new FileWriter(filePath));
			bufferWriter.write("\n");
			bufferWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String find(String text) {
		ArrayList<String> list = new ArrayList<>();
		String[] words;
		String result = "";

		try {
			File f = new File("C://temp/noteBook.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				words = line.split(" ");

				for (String str : words) {
					if (str.equals(text)) {
						result = line;
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}
}
