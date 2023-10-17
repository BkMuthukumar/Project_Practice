package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Send_keys extends Constructor {
//constructor
	public Send_keys(WebDriver driver) {
		super(driver);	
	}
	//element
	@FindBy(id = "name")
	WebElement name;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id= "phone")
	WebElement phone;
	@FindBy(id="textarea")
	WebElement address;
	

}
