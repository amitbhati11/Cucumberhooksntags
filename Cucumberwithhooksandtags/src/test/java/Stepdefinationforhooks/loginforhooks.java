package Stepdefinationforhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.loginpageforhooks;
//hooks are @Before,@After,@BeforeStep and @Afterstep

public class loginforhooks {
	
	WebDriver driver=null;
	loginpageforhooks loginhooks;
	
	@Before
	
	public void browsersetup() {
		
		String driverpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\Cucumberwithhooksandtags\\drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",driverpath);
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
System.out.print("browser launnch");
	}
	
	@After
	
	public void quitbrowser() {
		
		System.out.println("browser close");
		driver.quit();
		driver.close();
		
	}
	
@Given("open login page")
public void open_login_page() throws InterruptedException {

	driver.get("https://www.flipkart.com/");
	loginhooks =new loginpageforhooks( driver);
	//loginhooks.loginalert_link();
	
	Thread.sleep(2000);
}

@When("^test with valid (.*) and (.*)$")
public void test_with_valid_username_and_password(String username,String password) throws InterruptedException {
  loginhooks =new loginpageforhooks( driver);
  
  loginhooks.enter_username(username);
loginhooks.enter_pwd(password);  

Thread.sleep(3000);;
}

@When("^test with invalid (.*) and (.*)$")
public void test_with_invalid_username_and_password(String username,String password) throws InterruptedException {

	loginhooks=new loginpageforhooks(driver);
	
	loginhooks.enter_username(username);
	loginhooks.enter_pwd(password);

	Thread.sleep(3000);

}

@And("enter login button")
public void enter_login_button() throws InterruptedException {
System.out.println("button is clicked");
loginhooks =new loginpageforhooks( driver);

loginhooks.loginbtn();

Thread.sleep(3000);


}

@Then("navigated to home page")
public void navigated_to_home_page() {


}
	
	

}
