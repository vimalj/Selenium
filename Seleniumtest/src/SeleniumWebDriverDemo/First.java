package demopackage;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
 
public class First {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "D:\\Seleniumtutorial\\ChromeDriver\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
    // Launch website  
    driver.navigate().to("https://www.google.com/");  
    //driver.get("https://www.google.com/"); 
    
    //URL launch
    driver.get("https://www.google.com/");
    //identify element
    WebElement r = driver.findElement(By.name("q"));
    r.sendKeys("Daten Tales");
    // press ENTER
    r.sendKeys(Keys.RETURN);
      
    }  
  
}  