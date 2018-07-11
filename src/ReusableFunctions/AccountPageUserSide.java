package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.AccountPageUserSideScreen;

public class AccountPageUserSide extends TestSuiteBase.SuiteBase {
	
	
	
	
	
	public static void AddAccount(String EmailIDAccountPage,String ConfirmEmailIDAccountPage, String PasswordAccountPage, 
			String ConfirmPasswordAccountPage) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Account Page");
			
			sendkeys(AccountPageUserSideScreen.EmailIDAccountPage(), "Email Id", EmailIDAccountPage);
			sendkeys(AccountPageUserSideScreen.ConfirmEmailIDAccountPage(), "Confirm Email Id",ConfirmEmailIDAccountPage);
			sendkeys(AccountPageUserSideScreen.PasswordAccountPage(), "Password", PasswordAccountPage);
			sendkeys(AccountPageUserSideScreen.ConfirmPasswordAccountPage(), "Confirm Password", ConfirmPasswordAccountPage);
			Thread.sleep(2000);
			click(AccountPageUserSideScreen.CreateAccountButton(), "Create Account Button.");
			
			
		  	test.appendChild(tempTest);
		}
		
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}

}
	

}
