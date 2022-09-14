package pe.com.galaxy;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void teardDown(ITestResult result) {
		/*
		if(ITestResult.FAILURE == result.getStatus()) {
			try {
				
				//TakesScreenshot ts = (TakesScreenshot)driver;
				//File source  = ts.getScreenshotAs(OutputType.FILE);
				//FileHandler.copy(source, new File("./Screenshots/"+ result.getName()+ ".png"));
				System.out.println("Screenshot taken");
				
			} catch (Exception e){
				System.out.println("Screen while taking screen" + e.getMessage());
			}
			finally {
				//driver.quit();
			}
			
		}*/
	}

}
