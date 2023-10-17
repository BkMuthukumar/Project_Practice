package stepdefinition.com;

import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_class {
	public WebDriver driver;
 @BeforeClass
  public void setup() {
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://testautomationpractice.blogspot.com/");
	 driver.manage().window().maximize();
	 
 }
 
	
	

	

}
