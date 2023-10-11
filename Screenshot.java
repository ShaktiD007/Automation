package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

		public static void main(String[] args) throws IOException, InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.flipkart.com/");
			
			int a=10;
			
			//take screenshoty
		    File f   =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		    //Save in folder
		    Files.copy(f, new File("C:\\Users\\Shakt\\OneDrive\\Desktop\\flipkart.jpg"));
		    
			Thread.sleep(2000);
			
			driver.close();
			
			

		

	}

}
