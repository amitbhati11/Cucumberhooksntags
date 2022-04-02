package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page factory

public class loginpageforhooks {
	
	WebDriver driver;
	
	@FindBy(linkText="Login")
	WebElement loginlink;
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU' and @type='text']")
	WebElement Name;
	
	@FindBy(xpath="//input[@autocomplete='off' and @type='password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL and @type='submit']")
	WebElement btn;
	
	//constructor declaration
	
	public loginpageforhooks(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void loginalert_link() {
		
		loginlink.click();
	}
	public void enter_username(String username) {
		
		Name.sendKeys(username);
	}
	
	public void enter_pwd(String password) {
		pwd.sendKeys(password);
	}
	
  public void loginbtn() {
	  btn.click();
  }
}
