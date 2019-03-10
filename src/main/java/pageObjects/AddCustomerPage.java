package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	 public AddCustomerPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//div[@class='customer-name']/mat-form-field")
	 private WebElement customer_name_textbox;
	 
	 @FindBy(how = How.XPATH, using = "(//div[@formgroupname=\"BillingAddress\"]//mat-form-field)[0]")
	 private WebElement billing_address_street;

	 public void enter_customer_name(String customer_name) {
		 customer_name_textbox.sendKeys(customer_name);
	 }
	 
	 public void enter_billing_street(String billing_street_name) {
		 customer_name_textbox.sendKeys(billing_street_name);
	 }
	 
}
