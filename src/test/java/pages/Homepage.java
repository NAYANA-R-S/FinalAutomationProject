package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;
	
	By dismissLocationPop = By.xpath("//span[@class='glClose']");
	By cookie = By.id("onetrust-accept-btn-handler");
	
	By hamburger = By.xpath("//span[@class=\"hamburger\"]");
	By shoes = By.id("flyout-new_arrivals_top_nav_alias_acc_shoes");
	
	By selectshoe = By.xpath("(//img[@title=\"Block Heel Combat Boots\"])[1]");
	By size = By.xpath("//button[@title=\"Size: 6\"]");
	By addtocart = By.xpath("//button[@data-product-component=\"add-button\"]");
	By popclose = By.xpath("//div[@class=\"dy-lb-close\"]");
	By viewcart = By.xpath("(//a[@href=\"https://www.forever21.com/us/shop/checkout/basket\"])[3]");
	
	By checkout = By.xpath("(//a[@data-cart-component=\"checkout-action\"])[2]");
	
	By emailfld = By.id("login-form-email");
	By passwordfield = By.id("login-form-password");
	By loginbutton = By.id("login");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void categories()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(dismissLocationPop)).click();
		wait.until(ExpectedConditions.elementToBeClickable(cookie)).click();
		driver.findElement(hamburger).click();
		wait.until(ExpectedConditions.elementToBeClickable(shoes)).click();
	}
	
	public void shoe()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement boots = driver.findElement(selectshoe);
		js.executeScript("arguments[0].scrollIntoView();", boots);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(selectshoe)).click();
		wait.until(ExpectedConditions.elementToBeClickable(size)).click();
		WebElement sz = driver.findElement(size);
		js.executeScript("arguments[0].scrollIntoView();", sz);
		wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();
		wait.until(ExpectedConditions.elementToBeClickable(popclose)).click();
		driver.findElement(viewcart).click();
		driver.findElement(checkout).click();
	}
	
	public void setvalue(String email, String password)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(emailfld)).sendKeys(email);;
		driver.findElement(passwordfield).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(loginbutton).click();
	}
}
