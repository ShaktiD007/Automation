package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTip_17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.w3schools.com/mysql/default.asp");
		
		System.out.println("1");
		
//handling ToolTip:
		String expectedtooltip = "Tutorials and References";
		System.out.println("2");
		String actualtooltip = driver.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]")).getAttribute("title");
		System.out.println("3");
		System.out.println(actualtooltip);
		
//Verify ToolTip:
		
		if(actualtooltip.equals(expectedtooltip))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		driver.quit();
	}
	

}
