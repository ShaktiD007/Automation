package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown_8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.get("https://output.jsbin.com/osebed/2");
		
    //1.Select single value from DropDown
		
		WebElement skills=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
		
		Select aa= new Select(skills);
		aa.selectByIndex(10);
		aa.selectByValue("Android");
		aa.selectByVisibleText(null);
		
		
		
		
		
		
//		Select skills = new Select(driver.findElement(By.id("Skills")));
//		skills.selectByIndex(3);
		//skills.selectByValue("SQL");
		//skills.selectByVisibleText("SQL");
		
		
		
//	List<WebElement> list = skills.getOptions();
//	System.out.println(list.size());//to extract total no of values in DropDown
//	
//	for(int i=0; i<list.size(); i++)
//	{
//		System.out.println(list.get(i).getText());
//	}

//2.Select Multiple values from DropDown
	
//	Select fruits =new Select(driver.findElement(By.id("fruits")));
//	fruits.selectByIndex(0);
//	fruits.selectByValue("apple");
//	fruits.selectByVisibleText("Orange");
//	fruits.selectByIndex(3);
//	boolean b1=fruits.isMultiple();
//	System.out.println(b1);
	
//	Thread.sleep(2000);
//	driver.close();
//	
	
	
	
	
	
	}}

