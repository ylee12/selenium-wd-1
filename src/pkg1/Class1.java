package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Test\\bin\\pkg1\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","/Users/ylee/selenium-web-browser-dvr-mac/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apple.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[9]/a")).click();
		
	
	driver.findElement(By.xpath("//*[@id=\"ac-gn-searchform-input\"]")).sendKeys("silver IPAD with 32 Gig memory, Wifi + Cellular");
		
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id=\"exploreOrganic\"]/div[1]/div/h2")).click();
	
	driver.findElement(By.xpath("//*[@id=\"applecare_open\"]/span[2]")).click();
	
	String x = driver.getWindowHandle();
	driver.switchTo().window(x);
	
	driver.findElement(By.xpath("/html/body/overlay[5]/materializer/div/div[1]/div/materializer/accessory/div/div[1]/div[2]/div[2]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"primary\"]/summary-builder/div[3]/div[1]/div/div/div[1]/div/form/div/span/button")).click();
	
	
	
	driver.findElement(By.xpath("//*[@id=\"summaryheader-form\"]/div/span/button/span")).click();
	
	
	
	driver.findElement(By.xpath("//*[@id=\"summaryheader-form\"]/div/span/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"shoppingCart.actions.checkout\"]")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"guest-checkout\"]/span[1]")).click();
	
			
	}

}
