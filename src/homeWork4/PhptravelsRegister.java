package homeWork4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.RegisterPage;

public class PhptravelsRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiab\\Desktop\\QA_Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // initially driver will show yellow underline because the value of the local variable driver is not yet used by us, once we will start to use driver function, this yellow line will go 
			
		driver.get("https://www.phptravels.net/register");
		
		String title;
		title = driver.getTitle();
		System.out.println(title);
		
		String currentURL;
		currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		RegisterPage regpeg = new RegisterPage(driver); 
		//here, initially regpeg will show yellow underline, because the value of the local variable regpeg is not eyt use by us. once we will start to use regpeg, yellow line will go, /
		//Now To interect with web element of phptravels website, we called the previously created non-runnable class and also created object of it, now after that when we will use object only and add other needed functions with it. now after that when we will use object only and add other needed functions with it. 

		regpeg.getFirstName().sendKeys("Abi");
		regpeg.getLastName().sendKeys("Abdullah");
		regpeg.getphone().sendKeys("01767697602");
		regpeg.getemail().sendKeys("abiabdullah.phptravels@mail.com");
		regpeg.getpassword().sendKeys("pass123");
		regpeg.getconfirmpassword().sendKeys("pass1234");
		
		
	}

}
