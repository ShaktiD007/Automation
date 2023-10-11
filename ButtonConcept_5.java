package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonConcept_5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in");
		WebElement btn = driver.findElement(By.id("btn2"));//Skip singin button
		btn.click();
		//driver.findElement(By.xpath("//button[@id='btn2']")).click();
		
	}
}
