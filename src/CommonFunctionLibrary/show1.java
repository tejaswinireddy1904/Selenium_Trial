package CommonFunctionLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class show1 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/search?keyword=perfumes&santizedKeyword=perfumes&catId=0&categoryId=0&suggested=false&vertical=p&noOfResults=20&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy");	
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('see-more-products').scrollIntoView(true)");
		Thread.sleep(1000);

	}

}
