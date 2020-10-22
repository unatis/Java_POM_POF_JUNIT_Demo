package Suites;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Infra.Common;
import Infra.SeleniumPage;

public class Suite_1 {
		
	@Before
	public void Setup() {
				
		try {
			
			Common.InitEnvironment("FireFox");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void Sanity() {
		
		try {
			
			Common.NavigateTo("http://qadocs.com/selenium.html");
			
			SeleniumPage sp = new SeleniumPage();
			
			sp.Verify_Label_Text("Selenium automation");//Test page
			
			sp.Verify_Title_Text("Test page");//Selenium automatio
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@After
	public void CleanUP() {
		
		try {
			
			Common.ExitEnvironment();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
