//Working fine
package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.Initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}

	@Then("^user logs into app$")
	public void user_logs_into_app() throws Throwable {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String hometitle = homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", hometitle);
	}

}
