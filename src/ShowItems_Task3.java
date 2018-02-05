import java.beans.Visibility;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.unix.X11.Window;

public class ShowItems_Task3 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.snapdeal.com/search?keyword=perfumes&santizedKeyword=perfumes&catId=0&categoryId=0&suggested=false&vertical=p&noOfResults=20&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy");
		WebElement element1 = driver.findElement(By.id("see-more-products"));

		for (int i = 0; i <= 3 ; i++) {

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
			Thread.sleep(500);
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("see-more-products")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		}
	}

}
