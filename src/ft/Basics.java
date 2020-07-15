package ft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://www.paytm.com");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//div[@class='_3fM-']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	act.click(ele).perform();
	Thread.sleep(5000);
	WebElement f1 = driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(f1);
	Thread.sleep(5000);
	WebElement ele11 = driver.findElement(By.xpath("//span[@class='ng-scope']"));
	ele11.click();
	
	Thread.sleep(5000);
//	//driver.switchTo().frame(f1);
//	WebElement ele22 = driver.findElement(By.xpath("//a[@title='Close']"));
//	ele22.click();
//	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	
	driver.quit();
	
	
	
}
}
