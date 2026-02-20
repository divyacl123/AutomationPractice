package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PaginationTest {
	
	
	@Test
	public void paginationTableTest() {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//WebElement elem = driver.findElement(By.xpath("//h2[.='Pagination Web Table']"));
		WebElement elem=driver.findElement(By.xpath("//ul[@id='pagination']/li"));
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
		Actions act =  new Actions(driver);
		act.scrollToElement(elem).perform();
		
		//String expProduct = "E-Reader";
		int page=4;
		
		for(int i=1; i<=page ;i++)
			try {
					driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td[.='E-Reader']/following-sibling::td[1]")).click();
					String price = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td[.='E-Reader']/following-sibling::td[1]")).getText();
					System.out.println(price);
					break;
				}
			catch(Exception e) {
				driver.findElement(By.xpath("//ul[@id='pagination']/li[contains(.,'"+i+"')]")).click();
				System.out.println("testing");
			}
		}
		
		

}
