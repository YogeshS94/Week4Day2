package Week4.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1ActionsSelectable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Setting up the URL
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		List<WebElement> as = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
		
		Actions ac = new Actions(driver);
		System.out.println(as);
		
		for(int i=0; i<as.size();i++) {
			if((as.get(i).getText().equals("Item 2")) || (as.get(i).getText().equals("Item 4"))) {
				ac.keyDown(Keys.CONTROL)
				.click(as.get(i))
				.keyUp(Keys.CONTROL)
				.release()
				.perform();
			}
		}	
	}
}