package Week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1ActionsResize {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Setting up the URL
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(ele);
		Thread.sleep(1000);
		WebElement s = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
		Actions ac = new Actions(driver);
		
		// Click and hold and resize it and release the click and hold
		ac.clickAndHold(s)
		.moveByOffset(150, 100)
		.release().perform();
	}

}
