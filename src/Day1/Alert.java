package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://primusbank.qedge.com");
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[@href='login.php']")).click();
		//String str = d.switchTo().alert().getText();
		//System.out.println(str);
		//d.switchTo().alert().accept();

	}

}
