package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sele6{
	  public static void main(String[] args) throws InterruptedException {
	      //Open the chrome or firefox browser
	    System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	
	
	 //navigate to the URl
    driver.get("https://money.rediff.com/gainers");

    //Max the window
    driver.manage().window().maximize();

    //Xpath axes
    //self node
    String selfnode=driver.findElement(By.xpath("//a[contains(.,'Worldwide Aluminium')]/self::a")).getText();
    System.out.println("The self node is "+selfnode);

    //parent node
    String parentnode=driver.findElement(By.xpath("//a[contains(.,'Worldwide Aluminium')]/parent::td")).getText();
    System.out.println("The parent node is "+parentnode);

    //child nodes
    List<WebElement> childnode=driver.findElements(By.xpath("//a[contains(.,'Worldwide Aluminium')]/ancestor::tr/child::*"));
    System.out.println("The no of child nodes are "+childnode.size());

    //Ancestor Node
    String ancestornode=driver.findElement(By.xpath("//a[contains(.,'Worldwide Aluminium')]/ancestor::tr")).getText();
    System.out.println("The ancestor node is "+ancestornode);

    //Following
    List<WebElement> followingtag=driver.findElements(By.xpath("//a[contains(.,'Worldwide Aluminium')]/following::*"));
    System.out.println("The no of following elements from the current HTML tag is "+followingtag.size());

    //following-siblings
    List<WebElement> followingsib=driver.findElements(By.xpath("//a[contains(.,'Worldwide Aluminium')]/ancestor::tr/following-sibling::*"));
    System.out.println("The following siblings are "+followingsib.size());

    //preceding
    List<WebElement> pre=driver.findElements(By.xpath("//a[contains(.,'Worldwide Aluminium')]/preceding::*"));
    System.out.println("The no of preceding nodes are- "+pre.size());

    //preceding siblings
    List<WebElement> presiblings=driver.findElements(By.xpath("//a[contains(.,'Worldwide Aluminium')]/ancestor::tr/preceding-sibling::*"));
    System.out.println("The no of preceding siblings are - "+presiblings.size());




    driver.close();

	}

}
