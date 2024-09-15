package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an Web elements

	@FindBy(xpath="(//img[@src='bm.png'])[1]")
	WebElement Logo;

	@FindBy(xpath="//div[@id='navbarExample']/ul/li[1]/a")
	WebElement homemenu;

	@FindBy(xpath="//div[@id='navbarExample']/ul/li")
	List<WebElement> allmenuitems;

	@FindBy(xpath="//div[@id='tbodyid']/div[1]/div/div/h4/a")
	WebElement Samsumggalaxys6;


	//create a method to verify logo	
	public boolean islogodispalyed() {
		return Logo.isDisplayed();
	}

	//create a method to verify title
	public String verify_Hometitle() {
		return driver.getTitle();
	}

	//create a method for allmenu
	public List<WebElement> getmenuitem(){
		return allmenuitems;
	}

	//create a method to verify samsung	
	public boolean isSamsumggalaxys6dispalyed() {
		return Samsumggalaxys6.isDisplayed();
	}	

}
