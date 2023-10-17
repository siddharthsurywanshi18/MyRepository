package meghu;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usageofgetandsetsize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		int height=driver.manage().window().getSize().height;
		int width=driver.manage().window().getSize().width;
		System.out.println(height);
		System.out.println(width);
	   org.openqa.selenium.Dimension targetSize=new Dimension(800,300);
	   Thread.sleep(3000);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(3000);
		System.out.println(targetSize);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
