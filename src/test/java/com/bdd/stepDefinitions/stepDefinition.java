package com.bdd.stepDefinitions;

import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bdd.intailSetup.TestBase;
import com.bdd.intailSetup.commonUtils;
import com.bdd.pageObjects.Expedia;
import com.bdd.pageObjects.GoogleHomePage;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends TestBase {

	static Response rGetRepsonce;

	WebDriver driver = getWebDriver();

	@Given("^I navigate browser to \"([^\"]*)\"$")
	public void i_Navigate_browser_to(String strUrl) throws Throwable {
		driver.get(strUrl);
	}

	@When("^I search for \"([^\"]*)\" on Google home page$")
	public void i_search_for_on_Google_home_page(String searchTerm) throws Throwable {
		GoogleHomePage objGoogleHomePage = new GoogleHomePage(driver);
		objGoogleHomePage.enterAndSearchGoogle(searchTerm);
		Thread.sleep(5000);

	}

	@Then("^I should verify google search result page$")
	public void i_should_verify_google_search_result_page() throws Throwable {
		GoogleHomePage objGoogleHomePage = new GoogleHomePage(driver);
		boolean flag = objGoogleHomePage.verifySearchResultPage();
		Assert.assertTrue(flag, "Search Result page is not getting displayed");
	}

	@Then("^I take the screenshot of search result page$")
	public void i_take_the_screenshot_of_search_result_page() throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		String upDate = sdf.format(date);
		String dest = "src/test/resources/Screenshots/" + upDate + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

	}

	@When("^I should be able to view US version of the website$")
	public void i_should_be_able_to_view_US_version_of_the_website() throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		String strText = objExpedia.getBannerText();
		Assert.assertEquals(strText, "Welcome to Expedia.com");

	}

	@Then("^I select Flight and Hotel accommodation$")
	public void i_select_Flight_and_Hotel_accommodation() throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		objExpedia.clkflightHotelRadioBtn();
	}

	@Then("^I enter \"([^\"]*)\" in Origin field$")
	public void i_enter_in_Origin_field(String Origin) throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		objExpedia.enterAndSelectOrigin(Origin);
	}

	@Then("^I enter \"([^\"]*)\" in Destination field$")
	public void i_enter_in_Destination_field(String Destination) throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		objExpedia.enterAndSelectDestination(Destination);
	}

	@Then("^I enter Departing date$")
	public void i_enter_Departing_date() throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		objExpedia.enterDepartingDate();
	}

	@Then("^I Select the Travelers from Travelers dropdown$")
	public void i_Select_the_Travelers_from_Travelers_dropdown() throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		objExpedia.selectTravelers();
	}

	@Then("^I verify that Flight result page is displayed$")
	public void i_verify_that_Flight_result_page_is_displayed() throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		boolean flag = objExpedia.verifyFlightSearchResultPage();
		Assert.assertTrue(flag, "Flight Search Result page is not getting displayed");
	}

	@Then("^I click on Search button$")
	public void i_click_on_Search_button() throws Throwable {
		Expedia objExpedia = new Expedia(driver);
		objExpedia.clkSearchBtn();
	}

	@Given("^Get API for Country \"([^\"]*)\" and City \"([^\"]*)\"$")
	public static Response get_WeatherResponse(String Country, String City) throws IOException {
		String ResourceURL = commonUtils.getValFromResource("ResourceURL");
		ResourceURL = ResourceURL + "q=" + City + "," + Country
				+ "&cnt=1&units=metric&appid=69c70ff96f83c311cf0d1ac77240905b";
		rGetRepsonce = given().relaxedHTTPSValidation().when().get(ResourceURL);
		return rGetRepsonce;
	}

	@When("^Max Temp value \"([^\"]*)\" is to be validated$")
	public void max_Temp_value_is_to_be_validated(String strJsonkey) throws Throwable {
		strJsonkey = "list.main.temp_max";
		System.out.println("Response" + rGetRepsonce.getBody().asString());
		System.out.println(rGetRepsonce);
		String strKeyVal = rGetRepsonce.then().contentType(ContentType.JSON).extract().path(strJsonkey).toString();
		strKeyVal = strKeyVal.replace("[", "");
		strKeyVal = strKeyVal.replace("]", "");
		if (Float.parseFloat(strKeyVal) >= 10) {
			Assert.assertFalse(true, "Max Temp is greater than 10 celsius");
		} else {
			Assert.assertTrue(true, "Max Temp is greater than 10 celsius");
		}
	}

}
