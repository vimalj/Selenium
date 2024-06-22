// LinkText and Partial LinkText
//LinkText and Partial LinkText is used to click on hyperlinks on the web page.

package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sele2 {
 public static void main(String[] args) {
     //Open the chrome or firefox browser
     System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();

     //max the browser
     driver.manage().window().maximize();

     //navigate to the url
     driver.get("https://www.w3schools.com");

     //[By LinkText]
    driver.findElement(By.linkText("Try it Yourself")).click();
        
    
     //[By Partial LinkText]
     driver.findElement(By.partialLinkText("Try Backend")).click();
 }
}