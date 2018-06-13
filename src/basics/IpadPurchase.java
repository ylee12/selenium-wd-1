package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class IpadPurchase {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhiraj Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver","/Users/ylee/selenium-web-browser-dvr-mac/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "/Users/ylee/selenium-web-browser-dvr-mac/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
		
		driver.get("https://www.apple.com/ipad/");
		driver.findElement(By.xpath("//html//section[@class='fp-hero section-ipad background-alt large-section']//a[2]")).click();
		driver.findElement(By.xpath("//input[@id='dimensionColor-silver']")).click();
		
		

	// storage
		//driver.findElement(By.id("Item2-dimensionCapacity-32gb")).click();
		//driver.findElement(By.xpath("//input[@name='dimensionCapacity']")).click();
		Thread.sleep(4000); 
	    driver.findElement(By.xpath("//input[@id='Item2-dimensionCapacity-32gb']")).click();
	  //input[@id='Item2-dimensionCapacity-128gb']
		driver.findElement(By.xpath("//input[@id='Item3-dimensionConnection-wificell']")).click();
		
		
		
		
		//addapple care1
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//html//div[@class='as-bfaccessory-container']//span[2]")).click();
		
		//class= visuallyhidden //button[@class='button as-button-large as-button-block as-singlepartdescription-button']
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@class='button as-button-large as-button-block as-singlepartdescription-button']")).click();
		
		//driver.switchTo().alert().accept();
		//Continue
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[@class='label']")).click();
		
		//add to bag
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[@class='label']")).click();
		
		//review  bag
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[@class='label']")).click();
		
		
		//checkout
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@id='shoppingCart.actions.checkout']")).click();
		
		
	    //continue as guest
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[@aria-hidden='true'][contains(text(),'Continue as Guest')]")).click();
		
		
		//like it delivered
		Thread.sleep(3000); 
		//driver.findElement(By.xpath("//span[@class='form-icon-label'][contains(text(),\"I'd like it delivered\")]")).click();
		driver.findElement(By.xpath("//span[@class='form-icon-label'][contains(text(),\"like it delivered\")]")).click();
		
		//continue to shipping address
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Continue to Shipping Address')]")).click();
		
		//FName
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("John");
		
		//LName
		Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Lincon");
		 
		 
		 //St Address  //input[@id='checkout.shipping.addressSelector.newAddress.address.street']
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='street']")).sendKeys("2654 Wildberry Ct");
		 
		 //zipcode   //input[@id='checkout.shipping.addressSelector.newAddress.address.zipLookup.postalCode']
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("08817-2780");
		
		 //emailaddress   //input[@id='checkout.shipping.addressContactEmail.address.emailAddress']
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("arjundhiraj@yahoo.com");
		
		//phonenumber  //input[@id='checkout.shipping.addressContactPhone.address.fullDaytimePhone']
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='fullDaytimePhone']")).sendKeys("9177408080");
		
		
	    // Continue to payment  //button[@type='button'][contains(text(),'Continue to Payment')]
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Continue to Payment')]")).click();
		
		//Creditcard  option //div[@class='form-selector-title'][contains(text(),'Credit or Debit Card')]
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@class='form-selector-title'][contains(text(),'Credit or Debit Card')]")).click();
		//driver.close();
              
		////input[@id='checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-b02c53e3ad2f4500a4a2ac0aaf31a03b-326c.cardNumber']
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("1234567891123456");
		 
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='expiration']")).sendKeys("02/21");
		
		 //SecurityCode
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@name='securityCode']")).sendKeys("212");
		
		//Assert.assertEquals(l.getTitle)
		 
		//*[@id="checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-8fedf8b7025a421ba9e68a8e3944ec26-b32.cardNumber-error"]
		 String actual_error  = driver.findElement(By.xpath("//*[@class='form-message-wrapper']")).getText();
		 
		 String expected_error = "Please enter a valid credit card number.";
		 

		 Assert.assertEquals(actual_error,expected_error);
		 
	     System.out.println("Test Completed");
		 
		
	}

	

}
