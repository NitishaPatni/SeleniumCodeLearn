package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launchBrowser 
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		 WebDriver d = new ChromeDriver();
		 Thread.sleep(10000);
	        d.manage().window().maximize();
	        Thread.sleep(5000);
	        d.manage().window().minimize();
	        Thread.sleep(5000);
	        d.manage().window().maximize();
	        d.get("https://fb.com");
	        
		 WebElement userEmail = d.findElement(By.id("email"));
	     userEmail.sendKeys("ernitishaved@gmail.com");
	        
	        // used locator - xpath
	     WebElement userPassword = d.findElement(By.xpath("//input[@aria-label='Password']"));
	     userPassword.sendKeys("abcabcabc");
	        
	        // used locator - partial link text , link text
	     WebElement linkForgotPassword = d.findElement(By.partialLinkText("Forgot"));
	        linkForgotPassword.click();
	        
	        Thread.sleep(5000);
	        
	        String getNavigateURL = d.getCurrentUrl();
	        System.out.println(getNavigateURL);
	        d.navigate().back();
	        d.close();
	        Actions a = new Actions(d);
	      

	}

}
