
package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox_10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");

		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		
	//	Alert alert=driver.switchTo().alert();
		
//		Thread.sleep(2000);
//		alert.accept();
		
	
		
//1. Simple Alert Box
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();	
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
//	    Alert alrt = driver.switchTo().alert();//To control over the alert box
//		System.out.println(alrt.getText());//getting the text of alertbox
//    	Thread.sleep(2000);
//		alrt.accept();// press Ok button
//		
//2. Confirmation Alert Box
		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
//		Alert alert= driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(2000);
//		alert.accept();
//		//alert.dismiss();
		
//3.Prompt Alert Box
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		System.out.println("1");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(2000);
		System.out.println("2");
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Shakti");
		Thread.sleep(2000);
		alert.accept();

//Alert:-An Alert in Selenium is a small message box which appears on screen to give the user some information or notification.
//It notifies the user with some specific information or error, asks for permission to perform certain tasks and it also provide warning messages as well*/
		
	
		
		
	
	
	
	
	
	}

}

