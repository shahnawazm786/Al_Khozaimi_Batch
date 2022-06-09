package fileshandling;

import java.io.*;
import java.util.*;
public class ReadDataFromProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file=new FileReader("src/files/data.properties");
		Properties prop=new Properties();
		prop.load(file);
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.getProperty("url"));
		prop.clear();
		file.close();
	}

}
