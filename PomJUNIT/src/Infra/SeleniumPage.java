package Infra;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumPage {
	
	
	
	public void Verify_Title_Text(String ExpectedPageTitle) throws InterruptedException {
        
		try{			
			
			WebElement element = Common.driver.findElement(By.id("page_title_id"));

	        String pageTitle = element.getText();
	        
	        if(pageTitle.equals(ExpectedPageTitle))
	        {
	        	Common.ReportSuccess("Page title: " + pageTitle + " equals to expected " + ExpectedPageTitle);
	        }
	        else
	        {
	        	Common.ReportError("Page title: " + pageTitle + " Not equals to expected " + ExpectedPageTitle);	
	        }
	      
	        Thread.sleep(2000);
            
		}
		catch (Exception e)
		{
			Common.ReportError("ERROR: " + e.getMessage());
		}
        
    }
	
	public void Verify_Label_Text(String ExpectedText) throws InterruptedException {
        
		try{			
			
	        WebElement element = Common.driver.findElement(By.name("free_text_name"));

	        String pageTitle = element.getText();
	        
	        if(pageTitle.equals(ExpectedText))
	        {
	        	Common.ReportSuccess("Page title: " + pageTitle + " equals to expected " + ExpectedText);
	        }
	        else
	        {
	        	Common.ReportError("Page title: " + pageTitle + " Not equals to expected " + ExpectedText);
	        }
	      
	        Thread.sleep(2000);
            
		}
		catch (Exception e)
		{
			Common.ReportError(e.getMessage());
		}        
        
    }
}
