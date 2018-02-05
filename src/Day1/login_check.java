package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_check {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com");
		d.manage().window().maximize();
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
	
		d.findElement(By.id("btnLogin")).click();
		/*String act_res = d.findElement(By.linkText("Welcome Fiona")).getText();
		System.out.println(act_res);
		String exp_res = "Welcome Admin";
		if(exp_res.equals(act_res))
		{
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}*/
	}

}
