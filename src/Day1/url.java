package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class url {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://google.com");

	}

}
