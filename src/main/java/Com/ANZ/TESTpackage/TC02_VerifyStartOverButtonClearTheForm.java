package Com.ANZ.TESTpackage;

import org.testng.annotations.Test;

import Com.ANZ.POMpackage.CalculatorAndToolPOMclass;

public class TC02_VerifyStartOverButtonClearTheForm extends TestBaseClass
{

	@Test
	public void VerifyStartOverButtonClearTheForm() throws InterruptedException 
	{
		CalculatorAndToolPOMclass cl = new CalculatorAndToolPOMclass(driver);
    	
        cl.ApplicationTypeSingle();
        cl.NumberOfDependants();
        cl.PropertyTypeHomeToLiveIn();
        cl.YourAnnualIncome();
        cl.YourAnnualOtherIncome();
        cl.YourLivingExpences(); 
        cl.CurrentHomeloanMonthlyRepaymentsTooltip();
        cl.OtherLoanMonthlyPayments();
        cl.OtherMonthlyCommitments();
        cl.TotalCreditCardLimit();
        cl.WorkOutButton();
        
       Thread.sleep(3000);
        
        cl.ClickOnStartOver();
        
        String Actual = cl.YourEstimateCouldBorrow();
        System.out.println(Actual);
        
        String Exp = "0";
        
        
        
        
	}
	
}
