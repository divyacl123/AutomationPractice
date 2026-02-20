package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonTest {
	
	@Test
	public void amazonTest() throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Actions act =  new Actions(driver);
		WebElement elem = driver.findElement(By.xpath("//div[@class='nav-div']/a[contains(@aria-label,'Choose a lang')]"));
		
		act.moveToElement(elem).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='nav-text']/span[.='मराठी']/preceding-sibling::i[@class='icp-radio']")).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("testing");
	}

}
