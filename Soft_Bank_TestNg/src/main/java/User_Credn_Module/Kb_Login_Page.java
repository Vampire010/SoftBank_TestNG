package User_Credn_Module;

import org.openqa.selenium.By;

import Browser_SetUP.Browser_Config;

public class Kb_Login_Page  extends Browser_Config
{
	String Bank_IDs = "67831";
	String Banker_Username = "banker";
	String Banker_Password = "girish123";
	
	
	public void Login_Page ()
	{
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")).sendKeys(Bank_IDs);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")).sendKeys(Banker_Username);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")).sendKeys(Banker_Password);

		driver.findElement(By.xpath("//*[@id=\"clicked_when_enter_id\"]")).submit();

	}

}
