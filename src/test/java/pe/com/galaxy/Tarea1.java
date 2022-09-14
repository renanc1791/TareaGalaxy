package pe.com.galaxy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Tarea1 extends BaseTest {
  @Test
  public void Tarea() {
	  
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	  
	    driver.findElement(By.tagName("button")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
 	    driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button")).click();
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
 	   driver.findElement(By.name("firstName")).sendKeys("Renan");
 	   driver.findElement(By.name("middleName")).sendKeys("A.");
 	   driver.findElement(By.name("lastName")).sendKeys("Chacaliaza");

 	  List<WebElement> botons =  driver.findElements(By.xpath("//div[@class='oxd-form-actions']/button"));
 	  
		 for(WebElement elemento : botons) {
			 System.out.print("dato : " + elemento.getText());
			 if(elemento.getText().equals("Save")) {
				 elemento.click();
			 }
		 }
  }
}