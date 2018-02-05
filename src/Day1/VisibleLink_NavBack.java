package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisibleLink_NavBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			if (!links.get(i).getText().isEmpty()) 
			{				
			links.get(i).click();
			System.out.println(d.getCurrentUrl());
			
			d.navigate().back();
			links = d.findElements(By.tagName("a"));
		}
	}

}
}
