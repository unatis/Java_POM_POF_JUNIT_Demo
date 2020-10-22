package Infra;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

    public static void InitEnvironment(String BrowserType) throws InterruptedException {
		
		try{
			
			switch (BrowserType) {
			
				case "FireFox": 
					
					System.setProperty("webdriver.gecko.driver","D://Dev//Course//SeleniumServ//geckodriver.exe");				    									    				    
					driver = new FirefoxDriver();
				        
	            break;
	            
			   case "Chrome":
			   
				    System.setProperty("webdriver.chrome.driver", "D://Dev//Course//SeleniumServ//chromedriver.exe");
			   		driver = new ChromeDriver();
			   		
			   break;
			   
			   case "IE":
			   
			   		driver = new InternetExplorerDriver();
			   		
			   break;	
			   
			   default: 
				   	driver = new ChromeDriver();
			   break;
			}
			
			driver.manage().window().maximize();  
			wait = new WebDriverWait(driver, 5);
		    
		}
		catch (Exception e)
		{
			System.out.println("ERROR: " + e.getMessage());
		}
                
	}
		
	public static void NavigateTo(String URL) throws InterruptedException {
		
		try{			
			
			driver.get(URL);      
            
		}
		catch (Exception e)
		{
			System.out.println("ERROR: " + e.getMessage());
		}
                
	}	
		
	public static void ExitEnvironment() throws InterruptedException {
		
		try{			
			
	        driver.quit();
            
		}
		catch (Exception e)
		{
			System.out.println("ERROR: " + e.getMessage());
		}
                
	}
	
	public static void ReportError(String ErrorMessage) throws InterruptedException {
		
		try{			
			
			System.out.println("FAILED : " + ErrorMessage);
        	fail("FAILED : " + ErrorMessage);
        	
            
		}
		catch (Exception e)
		{
			System.out.println("ERROR: " + e.getMessage());
			fail("ERROR: " + e.getMessage());
		}
                
	}
	
	public static void ReportSuccess(String Message) throws InterruptedException {
		
		try{			
			
			System.out.println("PASS : " + Message);
			assertTrue("PASS : " + Message, true);
            
		}
		catch (Exception e)
		{
			System.out.println("ERROR: " + e.getMessage());
			fail("ERROR: " + e.getMessage());
		}
                
	}
	
}
