package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement homepage;
	
	//constructor
	
	public homepage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	public void navigatemethod() {
		
		homepage.sendKeys("apple i phone");
	}
	
	

}
