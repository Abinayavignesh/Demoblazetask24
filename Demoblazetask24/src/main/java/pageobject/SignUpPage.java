package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	//locate the Web elements in signupPage

	//signupbtn homepage
	@FindBy(id="signin2")
	WebElement signupbtnhome;

	//username
	@FindBy(id="sign-username")
	WebElement usernamefield;

	//password	
	@FindBy(id="sign-password")
	WebElement passwordfield;

	//signupbtn
	@FindBy(xpath="//button[.='Sign up']")
	WebElement signupbtn;

	//closebtn
	@FindBy(xpath="(//button[.='Close'])[2]")
	WebElement signupclosebtn;

	//Method for clicking signup button
	public void Signuphome(){
		signupbtnhome.click();
	}

	//Method for entering user name for signup
	public void getusername(String username) {
		usernamefield.sendKeys(username);
	}

	//Method for entering password
	public void getpassword(String password) {
		passwordfield.sendKeys(password);
	}

	//Method for signup button
	public void clicksignupbtn() {
		signupbtn.click();
	}






}
