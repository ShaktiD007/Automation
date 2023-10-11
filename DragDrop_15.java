package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(0);//used frame concept
		Actions action = new Actions(driver);
		
//1.Method
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().perform();
		Thread.sleep(2000);
		driver.close();
		
//2.Method
//		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
//		Thread.sleep(2000);
//		driver.close();
		
//3.Method		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		Actions action1 = new Actions(driver);
//		action1.dragAndDrop(drag,drop).perform();
//		Thread.sleep(2000);
//		driver.close();
		
	}

}
