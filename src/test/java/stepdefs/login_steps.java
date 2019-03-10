package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class login_steps {

    WebDriver driver;
    public login_steps(Hooks hook) {
    	driver = hook.driver;
    }
  
	@Given("^I navigate to the URL$")
	public void i_navigate_to_the_URL() throws Exception {
	    driver.get("https://fire.qa.honeywell.com/#/home");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("^I login to the application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_to_the_application_with_and(String login, String password) throws Exception {	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.click_login_button();
		loginPage.enter_username(login);
		Thread.sleep(3000);
		loginPage.enter_password(password);
		loginPage.click_dont_remember_user();
		   
		HomePage homePage = new HomePage(driver);
		Thread.sleep(30000);
		homePage.click_burger_navigate_icon();
		Thread.sleep(3000);
		homePage.click_customer_management_tab();
		Thread.sleep(3000);
		homePage.click_add_customer_button();
	}

	@Then("^the application should enter accounts page$")
	public void the_application_should_enter_accounts_page() throws Exception {

	}
	
	@Given("^account has been logged in$")
	public void account_has_been_logged_in() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^I create a Customer$")
	public void i_create_a_Customer() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^I validate that the customer has been created$")
	public void i_validate_that_the_customer_has_been_created() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

	}
}
