package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.Windows;

public class count 
{
	public static void main(String []args)
	{
		
		WebDriver driver = new FirefoxDriver(); 
			driver.get("https://www.ebay.in/");
//			WebDriverWait wait = new WebDriverWait(driver, 100);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mobile_accessories_876']/area[@alt='Power Banks ']"))).click();
			driver.manage().window().maximize();
			driver.findElement(By.id("gh-ac")).sendKeys("perfumes");
			driver.findElement(By.id("gh-btn")).click();
			List<WebElement> perfumes = driver.findElements(By.xpath(".//*[@class='sresult lvresult clearfix li shic']/h3/a"));
			System.out.println(perfumes.size());
			int count = 0;
			for(int i=0; i<=2; i++)
			{
				driver.findElements(By.xpath(".//*[@class='sresult lvresult clearfix li shic']/h3/a"));
				perfumes.get(i).click();
				count++;
				System.out.println(driver.getTitle());
//				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,50)");
				driver.navigate().back();
				perfumes = driver.findElements(By.xpath(".//*[@class='sresult lvresult clearfix li shic']/h3/a"));
			}
			System.out.println(count);
	}
}
