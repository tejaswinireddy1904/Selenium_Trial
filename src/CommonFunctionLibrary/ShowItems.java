package CommonFunctionLibrary;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class ShowItems {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/search?keyword=perfumes&santizedKeyword=perfumes&catId=0&categoryId=0&suggested=false&vertical=p&noOfResults=20&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy");
		WebElement element1 = driver.findElement(By.id("see-more-products"));
		for(int second =0; second>=20 ;second++)
		{
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
//			WebDriverWait wait= new WebDriverWait(driver, 40);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("see-more-products"))).click();
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",element1);
			Thread.sleep(3000);
		}
	
	}

}
