package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 public HomePage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//span[@class='burger-nav-icon-parent']")
	 private WebElement burger_navigate_icon;
	 
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'CUSTOMER MANAGEMENT')]")
	 private WebElement customer_management_tab;
	 
	 @FindBy(how = How.XPATH, using = "//*[contains(text(),'Add New Customer')]")
	 private WebElement create_new_customer_button;

	 public void click_burger_navigate_icon() {
		 burger_navigate_icon.click();
	 }
	 
	 public void click_customer_management_tab() {
		 customer_management_tab.click();
	 }
		 
	 public void click_add_customer_button() {
		 create_new_customer_button.click();
	 }
}
