package week5.day2.assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Leaftaps_CreateLead extends Baseclass_Leaftaps{
	@Test(dataProvider="CreateLeadFetchData")
	public void createLead(String cname, String fname, String lname, String pnum, String email) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}
	@DataProvider(name="CreateLeadFetchData")
	public String[][] createLeadSendData() throws IOException 
	{
		String[][] readExcelDataCreateLead = ReadExcelDataCreate_Leaftaps.readExcelDataCreateLead();
		return readExcelDataCreateLead;

	}

}
