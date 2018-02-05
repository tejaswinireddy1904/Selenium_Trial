package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Custmd {
	
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://amazon.com");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@placeholder='' and @class='nav-input']")).sendKeys("westin");
	}
}
