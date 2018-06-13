package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class Seledriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ylee/selenium-web-browser-dvr-mac/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		//Safari driver does not need to set System property
		//WebDriver driver=new SafariDriver();
		
		//System.setProperty("webdriver.gecko.driver", "/Users/ylee/selenium-web-browser-dvr-mac/chromedriver");
		//WebDriver driver=new ChromeDriver(); 
		
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		//driver.get("http://www.qaclickacademy.com/interview.php");
		//driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		//driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		//System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		
		/*
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("helloWorld");
		driver.findElement(By.name("pw")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		String my_str = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		//Assert.assertTrue(my_str.contains("check your username and password."));
		//Assert.assertFalse(my_str.contains("check your username and password."));
		
		System.out.println(my_str);
		*/
		
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("helloWorld");
		driver.findElement(By.name("pass")).sendKeys("abc123");
		
		/*
		 * Writing Custom XPath
           Syntax: //tagName[@attribute=’value’]
           
           <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" aria-required="1" placeholder="" aria-label="First name" id="u_0_d">

           //input[@aria-label='First name']
           $x("//input[@aria-label='First name']")
           
           <button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="websubmit" id="u_0_v">Sign Up</button>
			//button[@name='websubmit']
			$x("//button[@name='websubmit']")
			
			Use any tagName
			//*[@Attribute='value']
			 
			Use multiple attributes
			//tagName[@att_1='val_1'][@att_2='val_2']
			 
			//input[@type='password'][@autocomplete='new-password']
            $x("//input[@type='password'][@autocomplete='new-password']")
            
            Use CSS Selector
            Syntax: TagName[attribute='value']
            
            button[name='websubmit']
            
            Use any tagName in CSS selector (do not need to put *)
            [Attribute='value']
            
            Use shortcut CSS Selector syntax with id (note: has to use id for this short cut)
            
            Syntax: tagName#id_value
            input#username
            $("input#username")
            
            
            Use shortcut CSS Selector syntax with className (note: has to className for this short cut)
            
            Syntax: tagName.className
            input.button
            $("input.button")
            
            Xpath with regular expression
            Syntax: //tagName[contains("@attribute", "value")]
            input[contains("@id", "_")]
            
            CSS Selector with regular expression
            Syntax: //tagName[attribute*="value"]
            input[id*='_']
            
		 */
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Yong");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Lee");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("756-444-9288");
		
		//use Xpath
		//driver.findElement(By.xpath("//input[@type='password'][@autocomplete='new-password']")).sendKeys("My$new(pass&wrd");
		
		//use CSS Selector
		driver.findElement(By.cssSelector("input[type='password'][autocomplete='new-password']")).sendKeys("My$new(pass&wrd");
		
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		/*
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("helloWorld");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		*/
		//Assert.assertEquals(driver.getCurrentUrl(), "https://login.salesforce.com/");
		
		Thread.sleep(5000);
		driver.close();
		
		
		System.out.println("Bye Bye....");

		

	}

}

