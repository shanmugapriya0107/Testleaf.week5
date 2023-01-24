package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SNOW_UpdateIncident extends Baseclass_SNOW {

	@Test
	public void updateIncident() {
		
		String text = driver.findElement(By.xpath("(//a[@class='linked formlink'])[5]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(text, Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		WebElement findElement = driver.findElement(By.id("incident.urgency"));
		Select dd1 = new Select(findElement);
		dd1.selectByVisibleText("1 - High");
	
		WebElement findElement2 = driver.findElement(By.id("incident.state"));
		Select dd2 = new Select(findElement2);
		dd2.selectByVisibleText("In Progress");
		
		driver.findElement(By.id("sysverb_update_bottom")).click();

	}

}
