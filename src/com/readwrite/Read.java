package com.readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Read {
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\BikashKC\\eclipse-workspace2\\ReadWriteProperties\\src\\com\\readwrite\\test.properties");	
    FileReader filereader=new FileReader(file);
    Properties pr=new Properties();
    pr.load(filereader);
    System.out.println(pr.get("name"));
	}

}
