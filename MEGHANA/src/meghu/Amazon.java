package meghu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Iphone 13");
		 WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		 searchButton.click();
		 Actions actions = new Actions(driver);
		WebElement phone = driver.findElement(By.xpath("//h2[contains(@class,'a-size')]/a[contains(@href,'zAzOjowOjo')]"));
		actions.scrollToElement(phone).click(phone).perform();
//		actions.scrollByAmount(0, 300).perform();
		JavascriptExecutor jsc =  (JavascriptExecutor)driver;
		jsc.executeScript("return window.scrollBy(0,500)");
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='mbb-offeringID-1']"));
		actions.scrollToElement(checkBox).click(checkBox).perform();
		WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
		addToCartButton.click();
		driver.manage().window().minimize();
		driver.quit();

	}

}
