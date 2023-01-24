package week5.day2.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Baseclass_Leaftaps {
	
	public ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url, String uName, String pWord) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(uName);
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(pWord);
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
