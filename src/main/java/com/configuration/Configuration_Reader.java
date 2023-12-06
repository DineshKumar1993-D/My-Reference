package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties pro;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\pdine\\eclipse-workspace\\" + "CBE_Project_Nov23\\Configuration\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		pro = new Properties();

		pro.load(fis);
	}

	public String getUrl() {

		String url = pro.getProperty("url");

		return url;
	}
}
