package Week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealExercise {
	public static void main(String arg[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		ac.moveToElement(mens).perform();
		
		WebElement shirts = driver.findElement(By.xpath("//span[text()='Shirts']"));
		ac.moveToElement(shirts).perform();
//		shirts.click();
		ac.click();
		
		Thread.sleep(5000);
		
		WebElement first = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
		ac.moveToElement(first);
		
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div")).click();
		
		
		
		
	}
}
