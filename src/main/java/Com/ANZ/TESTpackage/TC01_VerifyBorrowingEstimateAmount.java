package Com.ANZ.TESTpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.ANZ.POMpackage.CalculatorAndToolPOMclass;

public class TC01_VerifyBorrowingEstimateAmount extends TestBaseClass

{
    @Test 
	public void VerifyBorrowingEstimateAmount() throws InterruptedException 
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
             String Actual = cl.YourEstimateCouldBorrow();
             System.out.println(Actual);
             
             String Exp = "$479,000";
             
             
           Assert.assertEquals(Actual,Exp);
             
             
       
             
    			
    			
	}
	
}
