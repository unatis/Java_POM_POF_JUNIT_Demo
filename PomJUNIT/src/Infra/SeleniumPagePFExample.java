package Infra;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPagePFExample {
	
	@FindBy(id="page_title_id")
    WebElement Title_Text_element;
			
	By Label_Text_element = By.name("free_text_name");

	public void Verify_Title_Text(String ExpectedPageTitle) throws InterruptedException {
	        
			try{			
									
		        String pageTitle = Title_Text_element.getText();
		        
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
				Common.ReportError(e.getMessage());
			}
	        
	    }
		
		public void Verify_Label_Text(String ExpectedText) throws InterruptedException {
	        
			try{	
				
		        String pageTitle = Common.driver.findElement(Label_Text_element).getText();
		        
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
