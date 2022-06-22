package fileshandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FilesHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String url="https://www.google.com";
		//String url="https://www.bings.com";
		readingDataFromFile();
		writingDataFromFile();
	}
	static void newFile()throws IOException {
		File file=new File("src/files/demo.txt");
		file.createNewFile();
	
	}
	static void readingDataFromFile() throws IOException {
		char[] c1=new char[100];
		File file=new File("src/files/demo.txt");
		FileReader reader=new FileReader(file);
		boolean c;
		
		while(reader.read(c1)!=-1) {
			System.out.println(c1);
		}
		reader.close();
	}
	static void writingDataFromFile() throws IOException {
		FileWriter writer=new FileWriter("src/files/abc.txt");
		writer.write("Hello I am good");
		writer.close();
	}
}
