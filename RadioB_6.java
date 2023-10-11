package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioB_6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		//WebElement radio= driver.findElement(By.xpath("//input[@value='Male']"));
		//radio.click();
	
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
