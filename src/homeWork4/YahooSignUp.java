package homeWork4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjectModel.YahooSignupPage;

public class YahooSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiab\\Desktop\\QA_Soft\\chromedriver_win32\\chromedriver.exe"); //this function is using here[System.setProperty(key, value)] key is "webdriver.chrome.driver" & value is "location of chromedriver exe file in pc" 
		WebDriver driver = new ChromeDriver();

		//first two code has to write always in runnable class because: 1st code, helps us to find the location of chromedriver .exe file & setup the properties of chrome driver .exe file which we had saved into our computer with webdriver)
		//and Second code helps us to open the google chrome by the WebDriver constructor. in selenium library, WebDriver was created as a constructor which has a browser instance of function for running/opening a browser automatically whenever we will call that WebDriver class by creating an object called driver
		//So, here WebDriver is a class (Constructor of Selenium library), and we are calling that class by creating and object by name driver. So whenever we will write the Webdriver class with the object name driver that constructor start working, and then wait for his value to give the result, 
		//so, after WebDriver driver = new ChromeDriver() {if we write chromedriver, it will open google chorme browser, if we write code for mozila or internet explorer, it will open the same}
		
		
		YahooSignupPage ysp = new YahooSignupPage (driver); // eita ki local variable (driver) na gloabal?
		
		//here, we are calling that POM non-runnable class and creating an object for that [as same as the process of calling any function to runnable class], just we are inputing the local variable "driver"
		
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		
		String title;
		title = driver.getTitle();
		System.out.println(title);
		
		
		String currentURL;
		currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		//shall we need to create WebElement variable here to store the test result? or we can directly start by calling object with other functions
		//amamr mote webelement variable er dorkar nai to store data of below fucntions, because, these fucntions have no output. one is void output, other two is boolean

		ysp.getFirstName().sendKeys("Abi");
		ysp.getFirstName().isDisplayed();
		ysp.getFirstName().isEnabled();
		
		System.out.println(ysp.getFirstName().isDisplayed());
		System.out.println(ysp.getFirstName().isEnabled());
		
		//to print our data sendkey(abi) in console, shall we need to save into webelement or how we can do?
		
		
		ysp.getLastName().sendKeys("Abdullah");
		ysp.getLastName().isDisplayed();
		ysp.getLastName().isEnabled();
		
		System.out.println(ysp.getLastName().isDisplayed());
		System.out.println(ysp.getLastName().isEnabled());
		
		ysp.getEmail().sendKeys("abiabdullah.qa");
		ysp.getEmail().isDisplayed();
		ysp.getEmail().isEnabled();
		
		System.out.println(ysp.getEmail().isDisplayed());
		System.out.println(ysp.getEmail().isEnabled());
		
		
		ysp.getPassword().sendKeys("123@$$$Pass");
		ysp.getPassword().isDisplayed();
		ysp.getPassword().isEnabled();
		
		System.out.println(ysp.getPassword().isDisplayed());
		System.out.println(ysp.getPassword().isEnabled());
		
		Select selectCC = new Select (ysp.getCountryCode());
		selectCC.selectByValue("BD");
		ysp.getCountryCode().isSelected(); //is.selected is not working, eita ki kaje use hoi?
		
		ysp.getPhoneNo().sendKeys("01767697602");
		System.out.println(ysp.getPhoneNo().isDisplayed());
		System.out.println(ysp.getPhoneNo().isEnabled());
		
		Select SelectBM = new Select(ysp.getBirthMonth());
		SelectBM.selectByValue("11");
		
		ysp.getDay().sendKeys("30");
		ysp.getDay().isDisplayed();
		ysp.getDay().isEnabled();
		
		System.out.println(ysp.getDay().isDisplayed());
		System.out.println(ysp.getDay().isEnabled());
		
		ysp.getYear().sendKeys("1984");
		ysp.getYear().isDisplayed();
		ysp.getYear().isEnabled();
		
		System.out.println(ysp.getYear().isDisplayed());
		System.out.println(ysp.getYear().isEnabled());
		
		ysp.getGender().sendKeys("Male");
		ysp.getGender().isDisplayed();
		ysp.getGender().isEnabled();
		
		Thread.sleep(2000);
		
		ysp.getTerms().click();
		ysp.getTerms().isDisplayed();
		ysp.getTerms().isEnabled();
		
		Thread.sleep(2000);
		
		ysp.getPrivacyPolicy().click();
		ysp.getPrivacyPolicy().isDisplayed();
		ysp.getPrivacyPolicy().isEnabled();
		
		//driver.navigate().back();
		
		//ysp.getSubmit().click();
		//ysp.getSubmit().isDisplayed();
		//ysp.getSubmit().isEnabled();
			
				
	}
}


