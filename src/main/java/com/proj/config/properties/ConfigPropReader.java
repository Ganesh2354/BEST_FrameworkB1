package com.proj.config.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigPropReader {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\Ganesh Dandekar\\Eclipse2023-03\\IDE\\eclipse-workspace"
				+ "\\BEST_FrameWork\\src\\main\\java\\com\\proj\\config\\properties"
				+ "\\Configuration.properties";
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String url= prop.getProperty("globalURL");
		System.out.println(url);
		String username= prop.getProperty("globalUserName");
		System.out.println(username);
		
	}

}
