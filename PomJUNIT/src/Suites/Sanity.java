package Suits;

import Common.Common;
import Main_Page.*;
import org.junit.Before;
//import org.testng.annotations.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sanity {

    @Before
    public void Setup(){
        try{
            Common.InitEnvironment(Common.Browser.CHROME);

            Common.NavigateTo("http://qadocs.com/Selenium.html");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void Sanity_Test_1_Positive(){

        Main_Page mp = new Main_Page();

        mp.Click_TryIt_Button();

        Main_Page.Click_VisitW3Schools_Link();

        Common.Await(5);

    }

    @Test
    public void Sanity_Test_2_Negative(){

        Info_Alert.Click_Ok_Button();

        //Main_Page.Click_TryIt_Button();

        Common.Await(5);

    }

    //@Test
    public void XXX_SanityCheck(){

        Common.Await(5);

    }

    @After
    public void Clean(){
        try{

            Common.ExitEnvironment();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
