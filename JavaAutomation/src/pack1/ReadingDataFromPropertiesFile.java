package pack1;

import java.io.*;
import java.util.*;
public class ReadingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file=new FileReader("src/pack1/test.properties");
		Properties prop=new Properties();
		prop.load(file);
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));
		prop.clear();
		file.close();
		
		
	}

}
