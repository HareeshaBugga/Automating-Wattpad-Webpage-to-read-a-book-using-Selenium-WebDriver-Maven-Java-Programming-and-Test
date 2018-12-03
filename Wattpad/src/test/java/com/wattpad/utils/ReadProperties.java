package com.wattpad.utils;

import java.io.FileReader;
import java.util.Properties;

public class ReadProperties {

	Properties prop;
	
	public ReadProperties(String filePath) {
		try {
			FileReader fis = new FileReader(filePath);
			prop = new Properties();
			prop.load(fis);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public String getPropertyValue(String key)
	{
		return prop.getProperty(key);
	}

	}
	
