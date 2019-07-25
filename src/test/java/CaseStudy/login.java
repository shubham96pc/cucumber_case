package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("SignIn homepage is open")
	public void signin_homepage_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browsers And Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			driver.navigate().to(url);
			driver.manage().window().maximize();
	}

	@Given("SignIn link is clicked")
	public void signin_link_is_clicked() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user provides {string} and pass as {string}")
	public void user_provides_and_pass_as(String username, String password) {
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
	}

	@Then("Home Page is opened")
	public void home_Page_is_opened() {
		driver.close();
	}

}
