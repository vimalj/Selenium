//selenium Locators
//Here we are locating by ID,NAME,CLASSNAME

package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
public static void main(String[] args) {
 //Open the chrome browser
 System.setProperty("webdriver.chrome.driver", "D:\\Seleniumtutorial\\ChromeDriver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();

 //max the chrome browser
 driver.manage().window().maximize();

 //navigate to the url
 driver.get("https://www.amazon.in/");

 //[By Id]
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-Shirts");
 //OR
 WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
 search.sendKeys("T-Shirts");

 //[By Name]
 driver.findElement(By.name("field-keywords")).sendKeys("Shirts");

 //[By Class]
driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("Shirts");


}
}
