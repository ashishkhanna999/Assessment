package com.bdd.intailSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class commonUtils {

	public static String getValFromResource(String key) throws IOException {
		Properties CONFIG = new Properties();
		FileInputStream fsConfig = new FileInputStream(
		System.getProperty("user.dir") + "/src/test/resources/Configuration.properties");
		CONFIG.load(fsConfig);
		return CONFIG.getProperty(key).trim();
	}

}
