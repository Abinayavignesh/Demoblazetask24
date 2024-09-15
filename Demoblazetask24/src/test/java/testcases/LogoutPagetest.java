package testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import Base.Baseclass;
import pageobject.Logoutpage;

public class LogoutPagetest extends Baseclass{
	
	@Test
	public void logout_() throws InterruptedException {
		//create an object
				Logoutpage logout=new Logoutpage(driver);
				logout.loginbtnhome();
				Thread.sleep(2000);
				logout.getusername(prop.getProperty("username"));
				Thread.sleep(2000);
				logout.getpassword(prop.getProperty("password"));
				logout.clickloginbtn();
				Thread.sleep(5000);
				logout.logoutbtn();
				Thread.sleep(1000);
				}
	@Test
	public void verify_logout() {
		Logoutpage logout=new Logoutpage(driver);
		Assert.assertEquals(logout.verify_logout(),"STORE");
	}
	

}
