package Com.ANZ.TESTpackage;


import org.testng.Assert;
import org.testng.annotations.Test;

import Com.ANZ.POMpackage.CalculatorAndToolPOMclass;

public class TC03_VerifyWorkOutHowMuchCouldBorrow extends TestBaseClass
{

	@Test
	public void VerifyWorkOutHowMuchCouldBorrow()
	{
		
		CalculatorAndToolPOMclass cl = new CalculatorAndToolPOMclass(driver);
		 cl.LivingExpenses1$();
		 cl.WorkOutButton();
		 
		             
		 
		String Actual = cl.ReturnMessage();
		System.out.println(Actual);
		
		String Exp = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641.";
		
		Assert.assertEquals(Actual, Exp);
	}
	
	
	
}
