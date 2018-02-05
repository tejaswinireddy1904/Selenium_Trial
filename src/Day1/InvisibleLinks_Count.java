package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvisibleLinks_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		List<WebElement> links = d.findElements(By.tagName("a"));
		int count = 0;
		for (int i = 0; i < links.size(); i++) 
		{
			if ( ! links.get(i).getText().isEmpty()) 
			{
				
				count++;
				
			}
			
		}
		System.out.println("Visible Links ="+count);
		int inv = (links.size())-(count);
		System.out.println("Invisible links ="+inv);

	}

}
