package meghu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/direct/inbox/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("meghana_6272");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Meghasachin@5272");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Show']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(2000);
	}

}
