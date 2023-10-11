package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/");
		//click on date
				WebElement date=driver.findElement(By.xpath("/html/body/form/input[1]"));
				//select date
				date.sendKeys("03");
				date.sendKeys(Keys.TAB);
				date.sendKeys("Feb");
			
				//tab
				date.sendKeys(Keys.TAB);
				date.sendKeys("2022");
				Thread.sleep(2000);
				//select time	
				date.sendKeys(Keys.TAB);
				
				date.sendKeys("1100");
				driver.findElement(By.xpath("/html/body/form/input[2]")).click();


	}

}
