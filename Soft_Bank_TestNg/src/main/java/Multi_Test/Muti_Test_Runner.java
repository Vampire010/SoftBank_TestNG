package Multi_Test;

import org.testng.annotations.Test;

import Test_Module.Create_Deposit_Account_Tests;
import Test_Module.Make_Deposit_To_Accounts_Page_Test;
import Test_Module.Regestartion_Page_Test;

public class Muti_Test_Runner 
{
	
	
	 Regestartion_Page_Test RGST = new Regestartion_Page_Test();
	 Create_Deposit_Account_Tests CDAT = new Create_Deposit_Account_Tests();
	 Make_Deposit_To_Accounts_Page_Test MKDPST = new Make_Deposit_To_Accounts_Page_Test();
	
	
	@Test ( groups = {"Functional_Test_case"} , priority = 0 , enabled = true )
	public void Regstartion_test1() throws InterruptedException
	{
		
		RGST.open_Browser();
		RGST.Regestartion_Page_Tests();
		System.out.println("Regestartion_Page_Tests Test Excuted");
		
	}
	
	@Test (groups = {"Smoke_Test_Case"} ,  priority = 2 , enabled = true )
	public void Create_Deposit_Account_Test1() throws InterruptedException
	{
		
		Thread.sleep(3000);
		CDAT.open_Browser();
		CDAT.Create_Deposit_Account_Pages_Tests();
		System.out.println("Create_Deposit_Account_Pages_Tests Test Excuted");

		
	}
	
	@Test(groups = {"Smoke_Test_Case" , "Regresssion_Test_Case"} , priority = 1 , enabled = false)
	public void Make_Deposit_To_Accounts_Page_Test3() throws InterruptedException
	{
		
		Thread.sleep(3000);
		MKDPST.open_Browser();
		MKDPST.Make_Deposit_To_Accounts_Pages_Tests();
		System.out.println("Make_Deposit_To_Accounts_Pages_Tests Test Excuted");
		
	}


}
