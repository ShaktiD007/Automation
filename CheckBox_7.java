package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox1")).click();//for unchecked
		Thread.sleep(2000);
		
//How to check checkBox is selected or not
		boolean b1= driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println(b1);
		Thread.sleep(2000);
		driver.close();
		
		if(b1==true)
		{
			System.out.println("CheckBox is selected");
		}
		else
		{
			System.out.println("CheckBox is not selected");
			driver.findElement(By.id("checkbox1")).click();
			System.out.println("Now CheckBox is selected");
			
		}
		driver.close();
	}

}
