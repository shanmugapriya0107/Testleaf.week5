package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass_Leaftaps {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("DemoCSR");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		findElement3.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
