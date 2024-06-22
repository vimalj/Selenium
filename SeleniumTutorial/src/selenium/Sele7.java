package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sele7{
	  public static void main(String[] args) throws InterruptedException {
	      //Open the chrome or firefox browser
	    System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
//      //navigate to the URL
    driver.get("https://demoqa.com/browser-windows");

//    //2.Navigate to the url
//      //Assign the url to a string variable
//      String url="https://demoqa.com/browser-windows";
//      driver.get(url);

      //max the window
      driver.manage().window().maximize();

      //URL of the page
      String urlofthepage=driver.getCurrentUrl();
      System.out.println("The URL of the page is "+urlofthepage);

      //Verify the URL
      if (urlofthepage.equals("https://demoqa.com/browser-windows"))
      {
          System.out.println("The URL is verified");
      }
      else
      {
          System.out.println("The URL is not verified");
      }

      //Title of the page
      String title=driver.getTitle();
      System.out.println("The title of the page is "+title);
      //verify
      if(title.equals("ToolsQA"))
      {
          System.out.println("Pass: The title is verified");
      }
      else
      {
          System.out.println("Fail: The title is not verified");
      }
      
      //length of the title
      int titlelength=driver.getTitle().length();
      System.out.println("The length of the title is "+titlelength);

      //pagesource
      String ps=driver.getPageSource();
      System.out.println("The page source is "+ps);

      //length of page source
      int pslength=driver.getPageSource().length();
      System.out.println("The length of the page source is "+pslength);

      //quit
      Thread.sleep(5000);
      driver.quit();

    }
}
