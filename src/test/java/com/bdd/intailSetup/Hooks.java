package com.bdd.intailSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Hooks {
	public static WebDriver driver;

	//Below function will run before every scenario to intialize driver
	@Before
	public void initDriver() {
		try {
			String browser = commonUtils.getValFromResource("browser");
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeDriverManager.getInstance().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Below function will run after every scenario
	@After
	public void TearDown() {
		try {
			driver.close();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
