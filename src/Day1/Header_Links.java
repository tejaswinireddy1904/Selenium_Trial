package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Header_Links {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://bing.com");
		d.manage().window().maximize();
		WebElement header = d.findElement(By.id("sc_hdu"));
		List<WebElement> links = header.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
		}

	}

}
