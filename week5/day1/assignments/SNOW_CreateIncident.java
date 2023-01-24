package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SNOW_CreateIncident extends Baseclass_SNOW {

	@Test
	public void createIncident() throws InterruptedException {
		
		Shadow shadow = new Shadow(driver);
		
		shadow.setImplicitWait(20);
		driver.findElement(By.id("sysverb_new")).click();
		driver.findElement(By.id("incident.short_description")).sendKeys("Testing");
		String attribute =driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value"); 
		System.out.println(attribute);
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(attribute, Keys.ENTER);
		String text1 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println(text1);
		if(attribute.equals(text1))
		{
			System.out.println("Both the Incident numbers are same");
		}
		else
		{
			System.out.println("Both the Incident numbers are different");
		}

	}

}
