package Day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Dropdown_Selected {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		WebElement drop = d.findElement(By.name("country"));
		
		List<WebElement> options = drop.findElements(By.tagName("option"));
		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) 
		{
			options.get(i).click();
			String str = options.get(i).getText();
			if (options.get(i).isSelected()) 
			{
				System.out.println(str+" is selected");
			}
			else 
			{
				System.out.println(str+" is not selected");
				File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				org.apache.commons.io.FileUtils.copyFile(src, new File("C:\\Users\\user\\Desktop\\Selenium\\screenshot\\"+str+".jpg"));
			}
		}

	}

}
