package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter_19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//1.clicking on button	
		//WebElement button = driver.findElement(By.id("entering"));
		//js.executeScript("arguments[0].click();", button);//clicking on button

//2.Insert any value in Textbox	
		js.executeScript("document.getElementById('email').value='abc';");
		
		
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain of site is:"+ domain);
		
		String url = js.executeScript("return "+ ""+ ".domain;").toString();
		System.out.println("URL of site is:"+ url);
		
		String title = js.executeScript("return document.domain;").toString();
		System.out.println("Title of site is:"+ title);
		
		//driver.quit();

	}

}

/*JavascriptExecutor is an interface that is used to execute JavaScript with Selenium. 
 * To simplify the usage of JavascriptExecutor in Selenium, 
think of it as a medium that enables the WebDriver to interact with HTML elements within the browser.*/
