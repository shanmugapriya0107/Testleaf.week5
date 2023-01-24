package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Leaftaps_DupliacteLead extends Baseclass_Leaftaps {

	@Test
	public void duplicateLead() throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("(//input[@name='emailAddress'])[1]")).sendKeys("shanmugapriya.mickey@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		String attribute = driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).getAttribute("value");
		//System.out.println(attribute);
		System.out.println("The Title of the page is: " + driver.getTitle());
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String res = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		//System.out.println(res);
		if(attribute.equals(res))
		{
			System.out.println("Same Name");
		}
		else
		{
			System.out.println("Different name");
		}


	}

}