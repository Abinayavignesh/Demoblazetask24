package testcases;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Base.Baseclass;
import pageobject.Homepage;


public class HomePagetest extends Baseclass{
	Homepage homepage;
	
	@Test
	public void verify_title() {
		homepage=new Homepage(driver);
		Assert.assertEquals(homepage.verify_Hometitle(),"STORE");
		
	}
	
	@Test
	public void verify_logo() {
		homepage=new Homepage(driver);
		Assert.assertTrue(homepage.islogodispalyed());
		
	}	
		
	@Test
	public void verify_allmenuitems() {
		homepage=new Homepage(driver);
		List<String> menulist=Arrays.asList("Home","Contact","About us","Cart","Log in","Sign up");
		List<WebElement> menuitem=homepage.getmenuitem();
		
		for(int i=0;i<menulist.size();i++) {
			for(WebElement element:menuitem) {
				if(menulist.get(i).equals(element.getText())) {
					Assert.assertTrue(true);
				}else {
					Assert.assertFalse(false);
				}
			}
		}
	}
	@Test
	public void verify_Samsunggalaxys6() {
		homepage=new Homepage(driver);
		Assert.assertTrue(homepage.isSamsumggalaxys6dispalyed());
		
		
		
	}
			
	



		
	
}