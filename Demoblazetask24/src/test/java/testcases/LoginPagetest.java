package testcases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import Base.Baseclass;
import pageobject.LoginPage;

public class LoginPagetest extends Baseclass {
	@DataProvider(name="testdata")
	public Object[][] getlogindata() throws EncryptedDocumentException, IOException, InterruptedException{
		
		//create a file object
		FileInputStream file= new FileInputStream("D:\\Mytasks\\Demoblaze-main\\src\\test\\java\\Testdata\\testdata.xlsx");
		
		//create a workbook object
		Workbook workbook=WorkbookFactory.create(file);
		
		// to access the sheet
		Sheet sheet=workbook.getSheet("sheet1");
		//get no of row
		int rowcount=sheet.getLastRowNum();
		//get no of column
		int columncount=sheet.getRow(0).getLastCellNum();
		
		//create a 2d array for store data
		Object[][]data=new Object[rowcount][columncount];
		Thread.sleep(2000);
		
		for(int i=0;i<rowcount;i++) {
			Row row=sheet.getRow(i+1);
			
			for(int j=0;j<columncount;j++) {
				Cell cell=row.getCell(j);
				
				//if cell is empty
				data[i][j]=(cell!=null)?cell.toString():null;
			}
		}
	
		return data;
		}
	
	@Test(dataProvider="testdata")
	
	public void Loginwith_valid_credientials(String username, String password) throws InterruptedException {
	//create an object
	LoginPage login=new LoginPage(driver);
	login.loginbtnhome();
	Thread.sleep(2000);
	//login.getusername(prop.getProperty("username"));
	login.getusername(username);
	Thread.sleep(2000);
	//login.getpassword(prop.getProperty("password"));
	login.getpassword(password);
	login.clickloginbtn();
	Thread.sleep(2000);
				
	}
	
	
	
}