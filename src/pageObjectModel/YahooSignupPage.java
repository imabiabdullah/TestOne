package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooSignupPage {

	
	//First we will take a global variable of WebDriver to use under all method or functions of this class
	
	WebDriver driver; //here, driver is class/global variable of webdriver which can be used by below all function. See, this driver of webdriver variable is location outside any method and after the class immediately, that's y it is global variable or class variable which is acesseble for all function, if we call WebDriver drver after main method or any other method, it will be treat as local variable like, in runnable class of Yahoosignup page, u can see, webdriver.chrome.driver called after main method, where driver is working as local variable.and collecting result or data from all runnable functions and storing it and then it is passing to global variable.

	
	//Then we will make a constructor of the above global variable for local variable to pass all the stored and collected webelement via local variable to global variable, so that same webdriver may run in nonunnbale & runnable class 
	
	public YahooSignupPage(WebDriver driver) {   // here, driver is local variable of webdriver, which is usable only under this constructor, reason of using this driver here is to pass the value of webelement via this local variable to global variable
		this.driver = driver; // first stage we create a constructor for main class "YahooSignupPage" where we gave or assign input as driver for WebDriver varibale, and now here we are confirming that whatever we will get value from this local variable via YahooSignupPage constructor in runnable class, those will be pass to global variable (this.variable)- [if global variable & local variable are in same name, we can write global variable as "this.name of variable"] and like this, both nonrunnable & runnable class will use the same driver of webdriver and interect with same browser.
	}
	
	
	public WebElement getFirstName () {
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		return firstName;
	}
	

    public WebElement getLastName () {
		WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		return lastName;
	}
	
	
	public WebElement getEmail () {
		WebElement email = driver.findElement(By.id("usernamereg-yid"));
		return email;
	}	
	
	
	public WebElement getPassword () {
		WebElement password = driver.findElement(By.name("password"));
		return password;
	}
	
	public WebElement getCountryCode () {
		WebElement countryCode = driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
		return countryCode;
	}
	
	public WebElement getPhoneNo () {
		WebElement phone = driver.findElement(By.name("phone"));
		return phone;
	}
	
	
	public WebElement getBirthMonth () {
		WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
		return birthMonth;
	}
	
	public WebElement getDay () {
		WebElement day = driver.findElement(By.name("dd"));
		return day;
	}
	
	public WebElement getYear () {
		WebElement year = driver.findElement(By.name("yyyy"));
		return year;
	}

   public WebElement getGender () {
	   WebElement gender = driver.findElement(By.name("freeformGender"));
	   return gender;
   }

   public WebElement getTerms () {
	   WebElement terms = driver.findElement(By.linkText("Terms"));
	   return terms;
   }
   
   public WebElement getPrivacyPolicy () {
	   WebElement privacyPolicy = driver.findElement(By.partialLinkText("Privacy"));
	   return privacyPolicy;
   }
   
   public WebElement getSubmit () {
	   WebElement submit = driver.findElement(By.linkText("//*[@id=\"reg-submit-button\"]"));
	   return submit;
   }

}
