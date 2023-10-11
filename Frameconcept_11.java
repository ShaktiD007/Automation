package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameconcept_11 {
//What is Frame:Is a html document inside any other html document it means any webpage inside any other webpage its called Frame.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
//Total no of Frames:
		int total = driver.findElements(By.tagName("iframe")).size();//select with <iframe>
		System.out.println(total);
		
//1.Single Frame:
		
		driver.switchTo().frame("");
		//	driver.switchTo().frame(0);//By index
//		driver.switchTo().frame("singleframe");//By Id
//		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[1]/iframe")));//By WebElment
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Lucky");//input[@type='text']
		
//2.Nested Frame
//		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
//		driver.switchTo().frame(driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]")));
//		System.out.println(1);
//		driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/iframe[1]")));
//		System.out.println(2);
//		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Lucky");
//		
//3.Switch over Parent Frame or web page
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]")));
		
		
		
		
		
		
		}

}

