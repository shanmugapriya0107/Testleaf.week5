package week5.day2.classwork;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Leaftaps_EditLead extends Baseclass_Leaftaps {

	@Test
	public void editLead() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Shanmugapriya");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		System.out.println("The Title of the page is: " + driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("NTT Data");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The changed name of the company is " +text);

	}

}
