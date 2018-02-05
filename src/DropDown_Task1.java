import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown_Task1 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/versace-eros-pour-femme-eau-de-parfum-100-ml/product-reviews/itme983hhssz8ekz?aid=overall&certifiedBuyer=true&page=1&pid=PERE983H9ZZ7FFEY&sort=MOST_RECENT");
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(3000);
			WebElement Drop_Option = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div/select/option["+i+"]"));
			Drop_Option.click();
			System.out.println(Drop_Option.getText()+":");
			System.out.println();
			for(int j=1; j<=5; j++)
			{
				WebElement str = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div/div/div[2]/div[4]/div["+j+"]/div/div[@class='col _390CkK']/div/div[@class='qwjRop']/div/div"));
				Thread.sleep(2000);
				String comment = str.getText();
				Thread.sleep(2000);
				System.out.println(comment);
				System.out.println("-----------------");
			}
			System.out.println("****************************************************************");
		}

	}

}
