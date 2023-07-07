package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	WebDriver driver;
	
	By dismissLocationPop = By.xpath("//span[@class='glClose']");
	By cookie = By.id("onetrust-accept-btn-handler");
	
	By logicon = By.xpath("//a[@class=\"header__utility-item header__utility-anchor link flex\"]");
	By createacc = By.xpath("//a[@href=\"#register\"]");
	
	By firstnamefield = By.id("registration-form-fname");
	By lastnamefield = By.id("registration-form-lname");
	By emailfield = By.id("registration-form-email");
	By phone = By.id("registration-form-phone");
	By month = By.id("registration-form-birthdaymonth");
	By date = By.id("registration-form-birthdayday");
	By passwordfield = By.xpath("//input[@name=\"dwfrm_profile_login_password\"]");
	By confpassfield = By.id("registration-form-password-confirm");
	By createaccount = By.id("CreateUser");
	
	
	public Loginpage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void log() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(dismissLocationPop)).click();
		wait.until(ExpectedConditions.elementToBeClickable(cookie)).click();
		driver.findElement(logicon).click();
		wait.until(ExpectedConditions.elementToBeClickable(createacc)).click();
		
	}
	public void name(String firstname, String lastname)
	{
		driver.findElement(firstnamefield).sendKeys(firstname);
		driver.findElement(lastnamefield).sendKeys(lastname);
	}
	 public void setvalue(String email,String phn)
	 {
		 driver.findElement(emailfield).sendKeys(email);
		 driver.findElement(phone).sendKeys(phn);
	 }
	 public void set()
		{
			WebElement mon=driver.findElement(month);
			Select m= new Select(mon);
			m.selectByValue("1.0");
			WebElement day=driver.findElement(date);
			Select d= new Select(day);
			d.selectByValue("7");
		}
	 public void setpass(String password,String confirmpassword)
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(passwordfield)).sendKeys(password);;
		 driver.findElement(confpassfield).sendKeys(confirmpassword);
	 }
	
	public void create()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement createAcc = driver.findElement(createaccount);
		js.executeScript("arguments[0].scrollIntoView();", createAcc);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(createaccount)).click();
		
	}

}
