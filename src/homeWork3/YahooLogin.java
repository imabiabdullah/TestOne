package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class YahooLogin {


	public static void main(String[] args) throws InterruptedException {
				
				
	//Task-3:Qus-B- Please fill up the Yahoo login form
				
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiab\\Desktop\\QA_Soft\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://login.yahoo.com/account/create");
	String elementOne = driver.findElement(By.xpath("//*[@id=\"account-attributes-challenge\"]/h1")).getText();
	String elementTwo = driver.findElement(By.xpath("//*[@id=\"account-attributes-challenge\"]/p")).getText();
	System.out.println(elementOne);
	System.out.println(elementTwo);
				
	//Sign Up Form Fill up-find and write first & last Name, Mail id & Password 
	
	driver.findElement(By.name("firstName")).sendKeys("Abi");
	driver.findElement(By.id("usernamereg-lastName")).sendKeys("Abdullah");	
	driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("abiabdullah.qa");
	driver.findElement(By.id("usernamereg-password")).sendKeys("Password");		

	//Function for Selecting one option/value from Dropdown box
	//Selenium WebDriver has 3 method to select an option/value from dropdown: 1. selectByIndex 2. selectByValue 3. selectByText by using "Select" Class of Selenium WebDriver
	//Step-1: First we have to create an object 
	
	Select scOption = new Select (driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select")));
				
	//Step-2: We have to use any of 3 method index/value/text by calling object 
	
	scOption.selectByValue("BD"); // Value = we can get value/id/index from HTML code of website by selecting the element
	boolean SelectBD = driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select/option[19]")).isSelected(); //Only by Xpath of specific selection, we can find the status of option selected or not, because, in perticular selection of"BD", we don't have any ID or Name but we just can have Xpath
	System.out.println(SelectBD);
				
	//Fill up the remaining mobile no after selecting the area code of mobile as BD for Bangladesh
	
	driver.findElement(By.name("phone")).sendKeys("01767697602");
				
	//Selecting the BirthMonth from Dropdown list by using "select" class & selectByValue orIndex or Text method
	
	Select birthMonth = new Select (driver.findElement(By.id("usernamereg-month")));
	birthMonth.selectByValue("10");
				
	driver.findElement(By.name("dd")).sendKeys("07"); // here we have to write the date, no option for selection
	driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]")).sendKeys("1984"); // here we have to write the year, no option for selection
				
				
	driver.findElement(By.name("freeformGender")).sendKeys("Male");
				
	Thread.sleep(2000);
				
	//Function for link check: we have to check whether Terms & Privacy policy link is working or not
	
	driver.findElement(By.linkText("Terms")).click();
				
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Privacy")).click();
						
	Thread.sleep(2000);
	
	//Function for clicking or Enter to Submit button after completing sign up form
	
	driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).submit();
	boolean submitDisplay = driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).isDisplayed();
	boolean submitEnable = driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).isEnabled();
	System.out.println(submitDisplay);
	System.out.println(submitEnable);
				
	}

}

//-------------------------------------------------------------------------------------------------------------------------------------//
