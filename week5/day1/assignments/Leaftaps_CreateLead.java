package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Leaftaps_CreateLead extends Baseclass_Leaftaps{
	@Test
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmugapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayasekaran");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8861827296");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmugapriya.mickey@gmail.com");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}

}
