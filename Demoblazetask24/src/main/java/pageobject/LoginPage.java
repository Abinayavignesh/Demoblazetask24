package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate the Web elements in signupPage

	//loginbtn homepage
	@FindBy(id="login2")
	WebElement loginbtnhome;
	//username
	@FindBy(id="loginusername")
	WebElement loginusernamefield;
	//password	
	@FindBy(id="loginpassword")
	WebElement loginpasswordfield;
	//loginbtn
	@FindBy(xpath="//button[.='Log in']")
	WebElement signuploginbtn;

	public void loginbtnhome(){
		loginbtnhome.click();

	}
	public void getusername(String username) {
		loginusernamefield.sendKeys(username);
	}

	public void getpassword(String password) {
		loginpasswordfield.sendKeys(password);
	}
	public void clickloginbtn() {
		signuploginbtn.click();
	}


}


