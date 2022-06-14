package Week4.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1ActionsSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Setting up the URL
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement drop = driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		Actions ac = new Actions(driver);
		
//		for(int i = 0; i<sort.size();i++) {
//			if(sort.get(i).getText().equals("Item 5")) {
//				ac.dragAndDrop(null, null)
//			}
//		}
		ac.dragAndDrop(drag, drop).perform();
	}

}
