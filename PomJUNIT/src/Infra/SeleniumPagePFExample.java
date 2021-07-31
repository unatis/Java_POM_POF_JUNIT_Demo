package Infra;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPagePFExample {
	
    @FindBy(id="tryit_id")
    WebElement TryIt_Button;

    /*@FindBy(linkText="Visit W3Schools")
    WebElement VisitW3Schools_Link;*/

    static By VisitW3Schools_Link = By.linkText("Visit W3Schools");

    public Main_Page(){
        PageFactory.initElements(Common.driver, this);
    }

    public void Click_TryIt_Button(){

        try{

            TryIt_Button.click();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void Click_VisitW3Schools_Link(){

        try{

            Common.driver.findElement(VisitW3Schools_Link).click();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
