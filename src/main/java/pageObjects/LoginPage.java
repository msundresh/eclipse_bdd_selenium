package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 public LoginPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Login')]")
	 private WebElement login_button;
	 
	 @FindBy(how = How.XPATH, using = "//input[@name='loginfmt']")
	 private WebElement username_textbox;
	 
	 @FindBy(how = How.XPATH, using = "//input[@name='passwd']")
	 private WebElement password_textbox;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id='idBtn_Back']")
	 private WebElement remember_password_no_button;
 
	 public void click_login_button() {
		 login_button.click();
	 }
	 
	 public void enter_username(String username) {
		 username_textbox.sendKeys(username);
		 username_textbox.sendKeys(Keys.TAB);
		 username_textbox.sendKeys(Keys.TAB);
		 username_textbox.sendKeys(Keys.TAB);
		 username_textbox.sendKeys(Keys.ENTER);
	 }
		 
	 public void enter_password(String password) {
		 password_textbox.sendKeys(password);
		 password_textbox.sendKeys(Keys.TAB);
		 password_textbox.sendKeys(Keys.TAB);
		 password_textbox.sendKeys(Keys.TAB);
		 password_textbox.sendKeys(Keys.ENTER);
	 }
	 
	 public void click_dont_remember_user() {
		 remember_password_no_button.click();
	 }
}
