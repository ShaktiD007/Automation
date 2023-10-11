package Selenium;

	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserCommands_2 {

		public static void main(String[] args) throws InterruptedException {

	//1.Launching Chrome Browser
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
	//2. Maximizing the browser
			driver.manage().window().maximize();

	//3.Launching URL:
			driver.get("https://www.fb.com/");
			
//4.Extract the title
			
			
		
		
			String actualtitle = driver.getTitle();
			
			System.out.println(actualtitle);
			///Fb
			String expectedtitle="Facebook – Log in or sign up";
			
//	//5.Validating Title
		
//			if(actualtitle.equals(expectedtitle)) 
//			{
//				System.out.println("Title is Matched");
//			}
//			else 
//			{
//				System.out.println("Title is not Matched");
//			}
////	//6.EqualsIgnoreCase		
//			if(actualtitle.equalsIgnoreCase(expectedtitle)) 
//			{
//				System.out.println("Title is Matched");
//			}
//			else 
//			{
//				System.out.println("Title is not Matched");
//			}
//	//7.Getting current URL of page
		//	System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);	
//		
	//8.Get page source of any page 
		//System.out.println(driver.getPageSource());
			
//	//9.Minimize the Window 
			driver.manage().window().setPosition(new Point(0, 500));	
//		
//	//10.Close the Browser window
		Thread.sleep(3000);		
			driver.close();	
			
		}
	}

	
	

