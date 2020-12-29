package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

	WebDriver driver;
	
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public WebElement getSpecials () {
		WebElement Specials = driver.findElement(By.linkText("Specials")); driver.getCurrentUrl(); 
		return Specials;
	}
		
	public WebElement getNewproducts () {
		WebElement Newproducts = driver.findElement(By.partialLinkText("New"));
		return Newproducts;
	}

	public WebElement getBestSellers () {
		WebElement Bestsellers = driver.findElement(By.partialLinkText("Best"));
		return Bestsellers;
	}

	public WebElement getOurstores () {
		WebElement Ourstores = driver.findElement(By.partialLinkText("Our"));
		return Ourstores;
	}

	public WebElement getContactus () {
		WebElement Contactus = driver.findElement(By.linkText("Contact us"));
		return Contactus;
	}

	public WebElement getTerms () {
		WebElement Terms = driver.findElement(By.partialLinkText("Terms"));
		return Terms;
	}

	public WebElement getAboutus () {
		WebElement Aboutus = driver.findElement(By.linkText("About us"));
		return Aboutus;
	}

	public WebElement getSitemap () {
		WebElement Sitemap = driver.findElement(By.linkText("Sitemap"));
		return Sitemap;
	}

	public WebElement getSitemaps () {
		WebElement Sitemaps = driver.findElement(By.linkText("Sitemap"));
		return Sitemaps;
	}

}
