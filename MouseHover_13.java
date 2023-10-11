package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
	//	driver.get("http://demo.automationtesting.in/SignIn.html");//for keyboard action
		driver.get("http://demo.automationtesting.in/Register.html");//for Mouse action

//Mouse & keyboard actions are handled by (Advanced User Interactions API.)		
		
		Actions action = new Actions(driver);

	//1]Keyboard actions:	
	WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/input[1]"));

	action.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys(email, "lucky").keyUp(email, Keys.SHIFT).doubleClick().contextClick().build().perform();
	Thread.sleep(5000);
		
	//2]Mouse actions:
      action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"))).build().perform();
      Thread.sleep(5000);
      action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Widgets')]"))).build().perform();
	 // driver.close();	
	}

}



