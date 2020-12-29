package homeWork4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.MyAccountPage;

public class AutomationAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abiab\\Desktop\\QA_Soft\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver ();
		
		
		MyAccountPage map = new MyAccountPage(driver); // called the POM no-runnable class to runnable calss and created object for that and as a input link the driver inside ()

	
		//First job is to call the webpage to browser..
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		Thread.sleep(2000);
		
		//Now we will start with the first link "Specials", we will test, by click, display, enable & then we will collect the url name & title name & link text name one and will print it to console
		map.getSpecials().click();
		map.getSpecials().isEnabled();
		map.getSpecials().isDisplayed();
		
		String Text , CurrentUrl , Title;
		Text = map.getSpecials().getText();
		CurrentUrl= driver.getCurrentUrl();
		Title = driver.getTitle();
		
		System.out.println(Text);
		System.out.println(Title);
		System.out.println(CurrentUrl);
		System.out.println(map.getSpecials().isEnabled());
		System.out.println(map.getSpecials().isDisplayed());

		
		Thread.sleep(2000);

		//-------------------------------------------------------------------------------------
		
		//Now we will do the same activity (like specials) with the second link "New products"
		
		map.getNewproducts().click();
		map.getNewproducts().isEnabled();
		map.getNewproducts().isDisplayed();
		
		
		String Text2, CurrentUrl2, Title2;
		Text2 = map.getNewproducts().getText();
		CurrentUrl2 = driver.getCurrentUrl();
		Title2 = driver.getTitle();
		
		System.out.println(Text2);
		System.out.println(Title2);
		System.out.println(CurrentUrl2);
		System.out.println(map.getNewproducts().isEnabled());
		System.out.println(map.getNewproducts().isDisplayed());
	
		Thread.sleep(2000);

		//-------------------------------------------------------------------------------------
		
		//Now we will do the same activity (like specials) with the second link "Best sellers"
	
		map.getBestSellers().click();
		map.getBestSellers().isEnabled();
		map.getBestSellers().isDisplayed();
		
		String Text3, CurrentUrl3, Title3;
		Text3 = map.getBestSellers().getText();
		CurrentUrl3 = driver.getCurrentUrl();
		Title3 = driver.getTitle();
		
		System.out.println(Text3);
		System.out.println(Title3);
		System.out.println(CurrentUrl3);
		System.out.println(map.getBestSellers().isEnabled());
		System.out.println(map.getBestSellers().isDisplayed());

		Thread.sleep(2000);

		//-------------------------------------------------------------------------------------
		
		//Now we will do the same activity (like specials) with the second link "Our stores"
		
		map.getOurstores().click();
		map.getOurstores().isEnabled();
		map.getOurstores().isDisplayed();
		
		String Text4, CurrentUrl4, Title4;
		Text4 = map.getOurstores().getText();
		CurrentUrl4 = driver.getCurrentUrl();
		Title4 = driver.getTitle();
		
		System.out.println(Text4);
		System.out.println(Title4);
		System.out.println(CurrentUrl4);
		System.out.println(map.getOurstores().isEnabled());
		System.out.println(map.getOurstores().isDisplayed());


		Thread.sleep(2000);

		//-------------------------------------------------------------------------------------
		
		//Now we will do the same activity (like specials) with the second link "Contact us"

		map.getContactus().click();
		map.getContactus().isEnabled();
		map.getContactus().isDisplayed();
		
		String Text5, CurrentUrl5, Title5;
		Text5 = map.getContactus().getText();
		CurrentUrl5 = driver.getCurrentUrl();
		Title5 = driver.getTitle();
		
		System.out.println(Text5);
		System.out.println(Title5);
		System.out.println(CurrentUrl5);
		System.out.println(map.getContactus().isEnabled());
		System.out.println(map.getContactus().isDisplayed());

	
		Thread.sleep(2000);

		//-------------------------------------------------------------------------------------
		
		//Now we will do the same activity (like specials) with the second link "Terms and conditions of use"

		map.getTerms().click();
		map.getTerms().isEnabled();
		map.getTerms().isDisplayed();
		
		String Text6, CurrentUrl6, Title6;
		Text6 = map.getTerms().getText();
		CurrentUrl6 = driver.getCurrentUrl();
		Title6 = driver.getTitle();
		
		System.out.println(Text6);
		System.out.println(Title6);
		System.out.println(CurrentUrl6);
		System.out.println(map.getTerms().isEnabled());
		System.out.println(map.getTerms().isDisplayed());
		

		Thread.sleep(2000);

		//-------------------------------------------------------------------------------------
		
		//Now we will do the same activity (like specials) with the second link "About us"

		map.getAboutus().click();
		map.getAboutus().isEnabled();
		map.getAboutus().isDisplayed();	

		String Text7, CurrentUrl7, Title7;
		Text7 = map.getAboutus().getText();
		CurrentUrl7 = driver.getCurrentUrl();
		Title7 = driver.getTitle();
		
		System.out.println(Text7);
		System.out.println(Title7);
		System.out.println(CurrentUrl7);
		
		System.out.println(map.getAboutus().isEnabled());
		System.out.println(map.getAboutus().isDisplayed());
		

		Thread.sleep(2000);

		//-------------------------------------------------------------------------------------
		
		//Now we will do the same activity (like specials) with the second link "Sitemap"

		map.getSitemap().click();
		map.getSitemap().isEnabled();
		map.getSitemap().isDisplayed();
		
		String Text8, CurrentUrl8, Title8;
		Text8 = map.getSitemap().getText();
		CurrentUrl8 = driver.getCurrentUrl();
		Title8 = driver.getTitle();
		
		System.out.println(Text8);
		System.out.println(Title8);
		System.out.println(CurrentUrl8);
		System.out.println(map.getSitemap().isEnabled());
		System.out.println(map.getSitemap().isDisplayed());
		
	}
}




