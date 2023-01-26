package week5.day2.assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Leaftaps_DeleteLead extends Baseclass_Leaftaps {

	@Test(dataProvider="DeleteLeadFetchData")
	public void deleteLead(String pnum) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys(pnum);										
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(text2);
		
	}
	@DataProvider(name="DeleteLeadFetchData")
	public String[][] deleteLeadSendData() throws IOException 
	{
		String[][] readExcelDataDeleteLead = ReadExcelDataDelete_Leaftaps.readExcelDataDeleteLead();
		return readExcelDataDeleteLead;
	}

}