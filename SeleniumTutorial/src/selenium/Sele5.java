//

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sele5{
  public static void main(String[] args) throws InterruptedException {
      //Open the chrome or firefox browser
    System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    //navigate to the URl
    driver.get("https://www.ebay.com/");

    //Max the window
    driver.manage().window().maximize();


    //Relative Xpath
    driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts for men");
    driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    
    System.out.println("Relative xpath worked ");
    
    
    //or operator
   driver.findElement(By.xpath("//input[@id='gh-ac'or @name='_nkw']")).sendKeys("Shirts for men");
   System.out.println("OR xpath worked ");

    //and operator
    driver.findElement(By.xpath("//input[@id='gh-ac'and @name='_nkw']")).sendKeys("Shirts for women");
    System.out.println("AND xpath worked ");

    //contains method
    driver.findElement(By.xpath("//input[contains(@name,'_n')]")).sendKeys("Shirts for kids");
    System.out.println("Contains xpath worked ");
    
   //starts-with
   driver.findElement(By.xpath("//input[starts-with(@name,'_n')]")).sendKeys("Tshirts for kids");
   System.out.println("Startswith  xpath worked ");
   
    //text()
    driver.findElement(By.xpath("//a[text()=' Sell']")).click();
    System.out.println("text xpath worked ");
    
  }
}