package CommonFunctionLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoreOffers {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://paytmmall.com/puma-men-s-gray-slip-on-nu-idp-white-casual-shoes-CMPLXFOOPUMA-MEN-S-GPUMA335823C3686110-pdp?product_id=154015540&discoverability=online&src=grid&tracker=||||%2Fg%2Ffootwear%2Fpuma-flat-50-off-additional-cashback-llpid-136365/catalog|136365|1||||");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div[3]/div/div[2]/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/div[3]/span[1]/i")).click();
	}

}
