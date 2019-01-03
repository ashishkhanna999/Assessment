package com.bdd.pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	WebDriver driver;

	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement searchInputBox;

	@FindBy(css = "div[id='search'] div[class='g']")
	private List<WebElement> listOfSearchResults;

	public void enterAndSearchGoogle(String searchTerm) {
		searchInputBox.clear();
		searchInputBox.sendKeys(searchTerm);
		searchInputBox.sendKeys(Keys.ENTER);
	}

	public boolean verifySearchResultPage() {
		boolean flag = false;
		if (listOfSearchResults.size() >= 1) {
			flag = true;
		}
		return flag;
	}

}
