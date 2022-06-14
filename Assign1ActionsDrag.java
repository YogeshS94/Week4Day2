package Week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1ActionsDrag {
	public static void main(String arg[]) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Setting up the URL
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(ele)
		.moveByOffset(100, 150)
		.release()
		.perform();
	}
}
