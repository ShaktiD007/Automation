package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageclick_9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/");
//Clicking on Image	    
	    driver.findElement(By.id("enterimg")).click();
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
	    
	}

}
