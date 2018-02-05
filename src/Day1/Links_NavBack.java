package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_NavBack {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			links.get(i).click();
			System.out.println(d.getCurrentUrl());
			
			d.navigate().back();
			links = d.findElements(By.tagName("a"));
		}

	}

}
