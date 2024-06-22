//Login into a page by using elements id, name, tagname etc.

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sele4{
  public static void main(String[] args) throws InterruptedException {
      //Open the chrome or firefox browser
    System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

      //max the browser
      driver.manage().window().maximize();

      //navigate to the url
      driver.get("https://www.browserstack.com/users/sign_in?utm_source=Email&utm_medium=Email&utm_campaign=FreeTrial_Verification");
      

      //Enter valid username
      driver.findElement(By.name("user[login]")).sendKeys("vljaswal57@gmail.com");

      //enter valid password
      driver.findElement(By.name("user[password]")).sendKeys("Password@123");

      //click on login  user_submit
      driver.findElement(By.id("user_submit")).click();

      Thread.sleep(5000);
      
     //Verify the URL
     //getCurrentURL()
     String act_url=driver.getCurrentUrl();
     System.out.println("The current url is:"+act_url);
     
     //verify
     String desired_url="https://live.browserstack.com/dashboard";
     if (act_url.equals(desired_url))
     {
         System.out.println("pass");
     }
     else {
         System.out.println("fail");
     }
     
      
  }
}