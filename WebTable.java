package Week4.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String arg[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in");
		
		driver.manage().window().maximize();
		
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS");
		Thread.sleep(1000);
		fromStation.sendKeys(Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU");
		Thread.sleep(1000);
		toStation.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(1000);
		
		List<WebElement> listTrain = driver.findElements(By.xpath("//div[@id='divTrainsList']//table[contains(@class,'TrainList')]//tr"));
		
		System.out.println(listTrain);
		int sizeListTrain = listTrain.size();
		System.out.println(sizeListTrain);
		
		
		
		for(int i=1; i<=sizeListTrain; i++) {
			////div[@id='divTrainsList']//table[contains(@class,'TrainList')]//tr[3]//td[2]
			String text = driver.findElement(By.xpath("//div[@id=\"divTrainsList\"]//table[contains(@class,'TrainList')]//tr["+ i +" ]//td[2]")).getText();
			System.out.println(text);
		}
		
		// OR
		
//		int sizeListTrain = driver.findElements(By.xpath("//div[@id='divTrainsList']//table[contains(@class,'TrainList')]//tr")).size();
//		System.out.println(sizeListTrain);
//		
//		List<String> m = new ArrayList<String>();
//		for(int i=1; i<=sizeListTrain; i++) {
//			String text = driver.findElement(By.xpath("//div[@id=\"divTrainsList\"]//table[contains(@class,'TrainList')]//tr["+ i +" ]//td[2]")).getText();
//			m.add(text);
//		}
//		
//		Set<String> newList = new HashSet<String>(m);
//		
//		if(sizeListTrain == newList.size()) {
//			System.out.println("No Duplicate");
//		}
//		else {
//			System.out.println("Duplicates available");
//		}
		
		
		
	}
}
