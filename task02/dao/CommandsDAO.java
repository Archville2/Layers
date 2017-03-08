package by.htp.lesson05.task02.dao;

public interface CommandsDAO {
	void add(String text);
	
	void delete();

	String print();

	String find(String text);
}
