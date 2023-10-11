package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_4 {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
	//Locators:		
	//1. ID
		//	driver.findElement(By.id("EmailAdress")).sendKeys("Admin");
			
	//2. name
		//	driver.findElement(By.name("password")).sendKeys("admin123");
			
	//3.Classname: classname many times wont be unique
			//driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched")).sendKeys("Shakti");
			
	//4.Xpath
	//		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).click();
			driver.findElement(By.xpath("// input [@ placeholder='Last Name']")).sendKeys("Nikita");
	//5.CSS
			//driver.findElement(By.cssSelector("#txtPassword")).click();
			
	//6.LinkText
			//driver.findElement(By.linkText("Forgot your password?")).click();
	         		
	//7.PartialLinkText
			
		//driver.findElement(By.partialLinkText("Forgot")).click();
			
			
	//8.Attribute	
		//driver.findElement(By.id("btnLogin")).click();		
			
		}

	}
