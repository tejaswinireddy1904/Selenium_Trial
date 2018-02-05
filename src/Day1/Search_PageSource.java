package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search_PageSource {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		String str = d.getPageSource();
		if (str.contains("TJ")) 
		{
		System.out.println("Specified element is present");	
		}
		else 
		{
			System.out.println("Specified element is not present");
		}

	}

}
