package com.bdd.pageObjects;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expedia {

	WebDriver driver;

	public Expedia(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "requestedSite")
	private WebElement bannerText;

	@FindBy(css = "input[value='flight-hotel']")
	private WebElement flightHotelRadioBtn;

	@FindBy(css = "li[class='results-item']:nth-child(1)")
	private WebElement firstOriginresultItem;

	@FindBy(xpath = "(//label[@class='text icon-before autocomplete-arrow']//input[contains(@class, 'origin gcw-required')])[1]")
	private WebElement originInputbox;

	@FindBy(xpath = "(//label[@class='text icon-before autocomplete-arrow']//input[contains(@class, 'destination gcw-required')])[2]")
	private WebElement destinationInputbox;

	@FindBy(id = "package-departing-hp-package")
	private WebElement departingDate;

	@FindBy(css = "button[class='datepicker-close-btn close btn-text']")
	private WebElement closeCalendarBox;

	@FindBy(id = "traveler-selector-hp-package")
	private WebElement travelersEle;

	@FindBy(xpath = "(//div[@class='traveler-selector-room-data target-clone-field']//button)[1]")
	private WebElement adultMinusBtn;

	@FindBy(xpath = "(//div[@class='traveler-selector-room-data target-clone-field']//button)[4]")
	private WebElement childrenAddBtn;

	@FindBy(xpath = "(//label[@class='select icon icon-toggle180 col gcw-child-field']//select[contains(@class, 'child-age-select')])[2]")
	private WebElement childAgedropdown;

	@FindBy(xpath = "//div[@class='traveler-selector-room-data target-clone-field']/../..//button[@class='close btn-text']")
	private WebElement closeTravlersBox;

	@FindBy(id = "resultsContainer")
	private WebElement flightResultsEle;

	@FindBy(id = "search-button-hp-package")
	private WebElement searchBtn;

	public String getBannerText() {
		String strtext = null;
		strtext = bannerText.getText();
		return strtext;
	}

	public void clkflightHotelRadioBtn() {
		if (!flightHotelRadioBtn.isSelected()) {
			flightHotelRadioBtn.click();
		}
	}

	public void enterAndSelectOrigin(String Originplace) throws InterruptedException {
		originInputbox.click();
		originInputbox.sendKeys(Originplace);
		Thread.sleep(1000);
		firstOriginresultItem.click();
		Thread.sleep(1000);
	}

	public void enterAndSelectDestination(String Destinationplace) throws InterruptedException {
		destinationInputbox.click();
		destinationInputbox.sendKeys(Destinationplace);
		Thread.sleep(1000);
		firstOriginresultItem.click();
		Thread.sleep(1000);
	}

	public void enterDepartingDate() throws InterruptedException {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, 1); // Adds 1 day
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");

		String formatted = format1.format(c.getTime());
		System.out.println("Date" + formatted);
		departingDate.sendKeys(formatted);
		Thread.sleep(1000);
		if (closeCalendarBox.isDisplayed()) {
			closeCalendarBox.click();
		}
	}

	public void selectTravelers() throws InterruptedException {
		travelersEle.click();
		Thread.sleep(1000);
		adultMinusBtn.click();
		childrenAddBtn.click();
		Select ele = new Select(childAgedropdown);
		ele.selectByValue("3");
		closeTravlersBox.click();

	}


	public boolean verifyFlightSearchResultPage() {
		boolean flag = false;
		WebDriverWait wait = new WebDriverWait(driver, 30000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("resultsContainer")));
		if (flightResultsEle.isDisplayed()) {
			flag = true;
		}
		return flag;
	}

	public void clkSearchBtn() {
		searchBtn.click();
	}

}
