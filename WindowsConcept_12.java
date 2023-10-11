package Selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsConcept_12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
//Handle main Window.when we have to handle parent window then we use getwindowHanle().
//when we have to handle child windows then we use getWindowHandles() & its returns Set<Strings>.
		
		
		String mainwindow = driver.getWindowHandle();

		
//1.Handle Parent Window
	
		// driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();

//2.open new separate windows:
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
//		
//3.open separate multiple windows:
		
//		driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();

	
//.Handle Child Window(Same for 1,2,3)
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> it = s1.iterator();//for iterating child windowes
		while(it.hasNext())
	{
		String childwindow = it.next();
			
		if(!mainwindow.equalsIgnoreCase(childwindow))
	{
		driver.switchTo().window(childwindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
		Thread.sleep(4000);
		driver.close();//its going to parent window after closing child window
				
			}
		}
		driver.switchTo().window(mainwindow);
	}

}
