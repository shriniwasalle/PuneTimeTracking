package com.bcone.punetimetracking.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.bcone.punetimetracking.utils.Utils;

public class Base extends Utils {
	
	public static final String CONFIG = "C:\\Users\\shriniwas.alle\\workspace\\PuneTimeTracking\\src\\test\\java\\com\\bcone\\punetimetracking\\config\\config.properties";
	
	public static Properties prop = new Properties();
	static FileInputStream inputStream;
	
	public static void init() throws IOException {
		loadPropertiesFile();
		String browser = prop.getProperty("browser");
		startBrowser(browser);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	public static void loadPropertiesFile() throws IOException {
		File configFile = new File(CONFIG);
		inputStream = new FileInputStream(configFile);
		prop.load(inputStream);
	}

	public void closeBrowser() {
		driver.close();
	}
}
