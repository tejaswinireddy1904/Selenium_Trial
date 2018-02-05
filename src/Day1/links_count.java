package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class links_count {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com");
		d.manage().window().maximize();
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
	
		d.findElement(By.id("btnLogin")).click();
		
		   java.util.List<WebElement> ele = d.findElements(By.tagName("a"));
		   System.out.println(ele.size());
		   for (int i = 0; i < ele.size(); i++) 
		   {
			   System.out.println(ele.get(i).getText());
     		}

	}

}
