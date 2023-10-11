package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploading_20 {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	WebElement browse = driver.findElement(By.xpath("//input[@id='imagesrc']"));
	//click on �Choose file� to upload the desired file
	browse.sendKeys("C:\\Users\\maxgen\\OneDrive\\Desktop\\Manual\\111.jpg"); //Uploading the file using sendKeys
	System.out.println("File is Uploaded Successfully");
	
}
}
