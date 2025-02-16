package testCases;

import org.testng.annotations.Test;

import Assignments.day1.LoginPage;
import Base.MainCoding;

public class TC_001 extends MainCoding{
	
	@Test
	public void runlogin() {
		LoginPage lp = new LoginPage();
		System.out.println("driver instance in Test"+driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin();
			

	}
	}


