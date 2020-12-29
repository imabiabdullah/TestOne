package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLinkText () {
		WebElement signUp = driver.findElement(By.linkText("Sign Up"));
		return signUp;	
	}
	
	public WebElement getFirstName () {
		WebElement firstName = driver.findElement(By.name("firstname"));
		return firstName;
	}
	
	public WebElement getLastName () {
		WebElement lastName = driver.findElement(By.name("lastname"));
		return lastName;
	}
	
	public WebElement getphone () {
		WebElement phone = driver.findElement(By.name("phone"));
		return phone;
	}
	
	public WebElement getemail () {
		WebElement email = driver.findElement(By.name("email"));
		return email;
	}
	
	public WebElement getpassword () {
		WebElement password = driver.findElement(By.name("password"));
		return password;
	}
	
	public WebElement getconfirmpassword () {
		WebElement confirmpassword = driver.findElement(By.name("confirmpassword"));
		return confirmpassword;
	}
	
	public WebElement getSignUp () {
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button"));
		return signup;
	}
}
