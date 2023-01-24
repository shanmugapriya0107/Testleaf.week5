package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SNOW_DeleteIncident extends Baseclass_SNOW {

	@Test
	public void deleteIncident() {
		
		Shadow shadow = new Shadow(driver);
		String text = driver.findElement(By.xpath("(//a[@class='linked formlink'])[5]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(text, Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.findElement(By.xpath("(//button[@class='form_action_button header  action_context btn btn-default'])[3]")).click();
		driver.findElement(By.id("ok_button")).click();
		
	}

}
