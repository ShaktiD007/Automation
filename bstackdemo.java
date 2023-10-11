package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class bstackdemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Compressed\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(co);
				
		//Maximize Window
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //Open url
		driver.get("https://bstackdemo.com/signin");
		Thread.sleep(2000);
		
		//Select username
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[1]/div[1]"));
		ele.click();
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@class='css-1uccc91-singleValue']"))); 

		List<WebElement> options =  sel.getOptions();

		for(WebElement p:options)
		{
			System.out.println(p.getText());
		}

	}

}
