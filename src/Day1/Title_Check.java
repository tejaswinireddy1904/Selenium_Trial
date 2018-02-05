package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Check {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		String exp_res = "Google";
		String act_res = d.getTitle();
		if (exp_res.equals(act_res)) 
		{
		 System.out.println("Titles are matching");	
		} 
		else 
		{
			System.out.println("titles are not matching");
		}

	}

}
