package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
	
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiab\\Desktop\\QA_Soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		//Task-3:Qus-C -Navigate to the following link: "http://automationpractice.com/index.php?controller=authentication&amp;back=my-account" and go to the footer,
		//and then check n see the footer links under information, click all the links one by one, starts with specials and ends in sitemap, 
		//after clicking each link when it navigates to the new page, read the title and url of the new page, print it in the console. 
		//Then come back again to the home page and click another link, Create script all the links under information
				
				
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&amp;back=my-account");
				
		Thread.sleep(2000);
				
		driver.findElement(By.linkText("Specials")).click();
		String titleOne = driver.getTitle();
		String urlOne = driver.getCurrentUrl();
		System.out.println(titleOne);
		System.out.println(urlOne);
				
		Thread.sleep(2000);
				
		driver.findElement(By.linkText("New products")).click(); //Remember, if we don't use "click" function, it won't direct to the link, so we have to use click function to go to another link after testing previous one
		String titleTwo = driver.getTitle();
		String urlTwo = driver.getCurrentUrl();
		System.out.println(titleTwo);
		System.out.println(urlTwo);
				
		Thread.sleep(2000);

		driver.findElement(By.linkText("Best sellers")).click();
		String titleThree = driver.getTitle();
		String urlThree = driver.getCurrentUrl();
		System.out.println(titleThree);
		System.out.println(urlThree);
				
		Thread.sleep(2000);
				
		driver.findElement(By.partialLinkText("Our")).click();
		String titleFour = driver.getTitle();
		String urlFour = driver.getCurrentUrl();
		System.out.println(titleFour);
		System.out.println(urlFour);
				
		Thread.sleep(2000);
				
		driver.findElement(By.partialLinkText("Contact")).click();
		String titleFive = driver.getTitle();
		String urlFive = driver.getCurrentUrl();
		System.out.println(titleFive);
		System.out.println(urlFive);
				
		Thread.sleep(2000);
				
		driver.findElement(By.partialLinkText("Terms")).click();
		String titleSix = driver.getTitle();
		String urlSix = driver.getCurrentUrl();
		System.out.println(titleSix);
		System.out.println(urlSix);
				
		Thread.sleep(2000);
				
		driver.findElement(By.partialLinkText("About")).click();
		String titleSeven = driver.getTitle();
		String urlSeven = driver.getCurrentUrl();
		System.out.println(titleSeven);
		System.out.println(urlSeven);
				
		Thread.sleep(2000);
				
		driver.findElement(By.linkText("Sitemap")).click();
		String urlEight = driver.getCurrentUrl();
		String titleEight = driver.getTitle();
		System.out.println(titleEight);
		System.out.println(urlEight);
				
		Thread.sleep(2000);
				
		driver.navigate().back();
				
	}

}

