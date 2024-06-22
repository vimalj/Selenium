package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sele10{
	  public static void main(String[] args) throws InterruptedException {
	      //Open the chrome or firefox browser
	    System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	  //navigate to the URL
        driver.get("https://sentry.io/signup/");

        //max
        driver.manage().window().maximize();

        //handle the checkboxes
        WebElement email=driver.findElement(By.xpath("//label[normalize-space()='I would like to receive updates via email.']"));
        email.click();
        
        //uncheck
        email.click();
        Thread.sleep(2000);
           
        //isDisplayed()
        Boolean bool1=email.isDisplayed();
        System.out.println(bool1);
        if(bool1==true)
        {
            email.click();
        }

	  }
}
