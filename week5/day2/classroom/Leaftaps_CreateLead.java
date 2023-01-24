package week5.day2.classroom;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Leaftaps_CreateLead extends Baseclass_Leaftaps{
	@Test(dataProvider="fetchData")
	public void createLead(String cName, String fName, String lName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8861827296");
		//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmugapriya.mickey@gmail.com");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		
	}
	@DataProvider(name="fetchData")
	public String[][] sendData()
	{
		String[][] data = new String[2][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Shanmugapriya";
		data[0][2]="J";
		
		data[1][0]="TestLeaf";
		data[1][1]="Priya";
		data[1][2]="J";
		
		return data;
	}
	

}

