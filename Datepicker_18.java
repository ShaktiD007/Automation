package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker_18 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("http://demo.guru99.com/test/");	
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	
	//click on date
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div/div/input")).click();
	Thread.sleep(2000);
	
	//select year
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).click();
	Thread.sleep(2000);
	WebElement year =driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	
	Select sel = new Select (year);
	sel.selectByVisibleText("2023");
	
	Thread.sleep(2000);
	
	//select month
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();
	Thread.sleep(2000);
	WebElement months=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	Select sel1=new Select(months);
	sel1.selectByVisibleText("February");
//	sel1.selectByIndex(1);

	
	//Select Date 1.
	//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]")).click();
	
	//Select Date 2.
	String date="14";
	List<WebElement>alldate = (List<WebElement>) driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]"));
	for(WebElement ele:alldate)
	{
	String 	date1 = ele.getText();//14
	if(date.equals(date1))
		ele.click();
	break;}
	

////1.Find the date time picker control in guru99
//	
//	WebElement dateBox = driver.findElement(By.xpath("/html/body/form/input[1]"));
//	Thread.sleep(2000);
////2.Fill date as mm/dd/yyyy as 09/25/2013
//
//	dateBox.sendKeys("05/12/2022");
//		      Thread.sleep(2000);
//		      
////3.Press tab to shift focus to time field
//
//	 
//	 dateBox.sendKeys(Keys.TAB);
//	 Thread.sleep(2000);
////4.Fill time as 02:45 PM
//		  
//	 dateBox.sendKeys("1205PM");
//	 Thread.sleep(2000);
//	 WebElement submit = driver.findElement(By.xpath("/html/body/form/input[2]"));
//	 submit.click();
//	// driver.close();
//	}  
 
}}