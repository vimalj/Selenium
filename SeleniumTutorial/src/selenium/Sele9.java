package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sele9{
	  public static void main(String[] args) throws InterruptedException {
	      //Open the chrome or firefox browser
	    System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	  //Navigate to the page
        driver.navigate().to("https://wordpress.com/");

        //max
        driver.manage().window().maximize();

        //click on get start
        driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).click();

        //back
        Thread.sleep(5000);
        driver.navigate().back();

        //forward
        Thread.sleep(5000);
        driver.navigate().forward();

        //refresh
        Thread.sleep(5000);
        driver.navigate().refresh();

        //close the browser
        Thread.sleep(6000);
        driver.close();

	}

}
