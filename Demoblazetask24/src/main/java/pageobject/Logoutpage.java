package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Logoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an Web elements
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

	//after login username
	@FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[7]/a[1]")
	WebElement welcomeuser;

	//logoutbtn
	@FindBy(xpath="//a[@id='logout2']")
	WebElement logoutbtn;

	//Method for login click
	public void loginbtnhome(){
		loginbtnhome.click();
	}

	//Method for entering user name
	public void getusername(String username) {
		loginusernamefield.sendKeys(username);
	}

	//Method for entering password
	public void getpassword(String password) {
		loginpasswordfield.sendKeys(password);
	}

	//Method for login click
	public void clickloginbtn() {
		signuploginbtn.click();
	}

	//Method for clicking logout button
	public void logoutbtn(){
		logoutbtn.click();
	}
	//Method for verifying user name
	public void verify_username() {
		String User=welcomeuser.getText();
		System.out.println(User);
	}

	//Method for verifying title
	public String  verify_logout() {
		String Title=driver.getTitle();
		System.out.println(Title);
		return Title;
	}
}		
