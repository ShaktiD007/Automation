package Selenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Navigation_command_3 {

		public static void main(String[] args) throws InterruptedException {
	  //1.Launching Chrome Browser
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	//2. Maximizing the browser
			driver.manage().window().maximize();

	//3.Launching URL:
			driver.get("http://www.google.com");
			
	//4.Navigation towards different site
			driver.navigate().to("http://www.Facebook.com");
			Thread.sleep(2000);
			
	//5.Back to Previous site
			driver.navigate().back();
			Thread.sleep(2000);
			
	//6.Back to next site
			driver.navigate().forward();
			Thread.sleep(2000);
			
	//7.Back to Previous site
			driver.navigate().back();
			Thread.sleep(2000);
			
	//8.Back to next site
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().to("http://www.amazon.com");
	//9.Refresh the browser
			driver.navigate().refresh();
			Thread.sleep(2000);

	//10.close 
			driver.close();

		}

	}

	

