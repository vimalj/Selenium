//using the TagName as a Selenium Locator to inspect

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sele3{
  public static void main(String[] args)  {
      //Open the chrome or firefox browser
    System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

      //max the browser
      driver.manage().window().maximize();

      //navigate to the url
      driver.get("https://www.javatpoint.com/selenium-webdriver-locating-strategies-by-tag-name");

      //By TagName
      // Click on the textbox and send value  
      driver.findElement(By.tagName("input")).sendKeys("Postman");  
                 
          // Click on the Submit button using click() command  
          driver.findElement(By.tagName("button")).click();    
          
          //Verify Title
          //getTitle()
          String act_title=driver.getTitle();
          System.out.println(act_title);

          String desired_title="Selenium Webdriver Locating Strategies By Tag Name - javatpoint";
          
          //verify
          if(act_title.equals(desired_title))
          {
              System.out.println("pass");
          }
          else {
              System.out.println("fail");
          }
          
  
          //Getting the page source
         // String ps=driver.getPageSource();
        //  System.out.println(ps);
          
          //close the browser
         // driver.close();
          //System.out.println("Browser Closed");
  }
  
}
