package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DyanamicTableTest {

	
	@Test
	public void dynamicTest() throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement elem = driver.findElement(By.xpath("//h2[.='Dynamic Web Table']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", elem);
		Thread.sleep(3000);
		String name = "Firefox";
		String cpu = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr/td[.='"+name+"']/following-sibling::td[contains(.,'%')]")).getText();
		System.out.println(cpu);
		driver.quit();
		System.out.println("for merge conflict testing");
	
	}
	
}
