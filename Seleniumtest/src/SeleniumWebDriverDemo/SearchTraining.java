package SeleniumWebDriverDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTraining {
	
	WebDriver driver;
	
	//Launch Firefox
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Seleniumtutorial\\ChromeDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com");	
		
	}
	
	

	public static void main(String[] args) {
		
		SearchTraining obj=new SearchTraining();
		obj.LaunchBrowser();
	}

}