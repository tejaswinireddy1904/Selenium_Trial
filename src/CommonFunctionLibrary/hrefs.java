package CommonFunctionLibrary;

import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hrefs {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/search?q=perfumes&otracker=start&as-show=on&as=off");
//		driver.findElement(By.xpath(".//*[@class='LM6RPg']")).sendKeys("Perfumes");
//		List<WebElement> links = driver.findElements(By.xpath(".//*[@class='_2cLu-l']"));
//		System.out.println(links.size());
		
//			WebElement links = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]"));
//			System.out.println();
//			List<WebElement> all = links.findElements(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[@class='col MP_3W3 _31eJXZ']/div/a"));
			
		driver.findElement(By.xpath("html/body/div[2]/div/div/button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("document.getElementByXpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")");
		

	}

}
