package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class cleartrip
{
	public static void scrollToElement(WebDriver driver, WebElement element) 
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
	@Test
	public static void selectLowestPriceTicket() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		WebElement whereFrom = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		whereFrom.sendKeys("Bangalore");
		
		WebElement fromcity = driver.findElement(By.xpath("//p[text() = Bangalore, IN - Kempegowda International Airport (BLR)']"));
		action.click(fromcity).build().perform();
		
		//WebElement whereTo = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		
	}

}
