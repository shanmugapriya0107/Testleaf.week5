package week5.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Baseclass_SNOW {
	
	public ChromeDriver driver;

	@Test
	public void snow() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev121382.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Priyashan123#");
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(20);
		WebElement findElementByXPath2 = shadow.findElementByXPath("//input[@id='filter']");
		shadow.setImplicitWait(20);
		findElementByXPath2.sendKeys("Incidents", Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Incidents']").click();
		WebElement findElementByXPath = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(findElementByXPath);
		
	}

}
