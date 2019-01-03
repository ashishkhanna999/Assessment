package com.bdd.intailSetup;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver getWebDriver() {
		if (Hooks.driver == null) {
			synchronized (TestBase.class) {
				Hooks.getDriver();
			}
		}
		return Hooks.driver;
	}

}
