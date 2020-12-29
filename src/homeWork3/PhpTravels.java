package homeWork3;
		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class PhpTravels {

	public static void main(String[] args) throws InterruptedException {
				
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiab\\Desktop\\QA_Soft\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	//Task-3:Qus-A -Create a programming scripts using selenium library that will fill up the registration form from the following page "https://www.phptravels.net/register", and
	//then read the text in the sign up button, also read the URL and title of the page and print that in the console
				
	//Function to run the Website (URL) 
	driver.get("https://www.phptravels.net/register");
								
	//Function to know the URL name of Website 
	String urlName = driver.getCurrentUrl();
	System.out.println(urlName);
							
	//Function to know the title of Website
	String title = driver.getTitle();
	System.out.println(title);
								
	//Function to know the link name of any element of Website
	//way one..
	WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[1]/div/h3"));
	String elementName = element.getText();
	System.out.println(elementName);
								
	//Way two.. 				
	String linkName =driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[1]/div/h3")).getText();
	System.out.println(linkName);
								
	//Function to (boolean) know whether our element of website are displaying / enabled or not
	boolean display = driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[1]/div/h3")).isDisplayed();
	boolean enable = driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[1]/div/h3")).isEnabled();
	System.out.println(display);
	System.out.println(enable);
								
	//Function of giving some time to test another program after existing or earlier program
	Thread.sleep(2000);
				
	driver.findElement(By.name("firstname")).sendKeys("Abi");
	driver.findElement(By.name("lastname")).sendKeys("Abdullah");
	driver.findElement(By.name("phone")).sendKeys("+19294290784");
	driver.findElement(By.name("email")).sendKeys("abiabdullah.qa@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Password");
	driver.findElement(By.name("confirmpassword")).sendKeys("Password");
				
		}

	}
//-------------------------------------------------------------------------------------------------------------//
