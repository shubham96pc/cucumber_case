package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	WebDriver driver;
	@Given("Homepage is open")
	public void homepage_is_open() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browsers And Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			driver.navigate().to(url);
			driver.manage().window().maximize();
	    
	}

	@Given("SignUp link is clicked")
	public void signup_link_is_clicked() throws InterruptedException {
		driver.findElement(By.linkText("SignUp")).click();
		Thread.sleep(2000);
	
	    
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
		driver.findElement(By.name("userName")).sendKeys("qazxsw");
	}

	@When("user provides first name as {string}")
	public void user_provides_first_name_as(String string) {
		driver.findElement(By.id("firstName")).sendKeys("King");
	    
	}

	@When("user enters last name as {string}")
	public void user_enters_last_name_as(String string) {
		driver.findElement(By.id("lastName")).sendKeys("Queen");
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys("kingqueen");
	}

	@When("User re-enters password as {string}")
	public void user_re_enters_password_as(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys("kingqueen");
	}

	@When("user selects Gender as {string}")
	public void user_selects_Gender_as(String string) {
		driver.findElement(By.xpath("//input[@id='gender'][@value='Male']")).click();
	}

	@When("user provides Email id as {string}")
	public void user_provides_Email_id_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys("king@gmail.com");
	}

	@When("user enters Mobile number as {string}")
	public void user_enters_Mobile_number_as(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("0123456789");
	}

	@When("user enters Date of Birth as {string}")
	public void user_enters_Date_of_Birth_as(String string) {
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Select year= new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByVisibleText("1998");
		Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Jan");
		driver.findElement(By.linkText("28")).click();
	}

	@When("user provides Address as {string}")
	public void user_provides_Address_as(String string) {
		driver.findElement(By.name("address")).sendKeys("Bengaluru");
	}

	@When("user selects Security Question as {string}")
	public void user_selects_Security_Question_as(String string) {
		Select Sel=new Select(driver.findElement(By.name("securityQuestion")));
		  Sel.selectByIndex(1); 
	}

	@When("user provides Answer to the Security Question as {string}")
	public void user_provides_Answer_to_the_Security_Question_as(String string) {
		driver.findElement(By.name("answer")).sendKeys("India");
	}

	@When("user clicks on Register button")
	public void user_clicks_on_Register_button() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("user will find testmeapp LogIn homepage")
	public void user_will_find_testmeapp_LogIn_homepage() {
		 System.out.println("The LogIn of TestMe app displayed");
	}


}
