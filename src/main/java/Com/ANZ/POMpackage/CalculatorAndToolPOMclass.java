package Com.ANZ.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CalculatorAndToolPOMclass 
{

	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//input[@id=\"application_type_single\"]")
	WebElement Single;
	
	public void ApplicationTypeSingle()
	{
		Single.click();
	}
	

	@FindBy(xpath="//select[@title=\"Number of dependants\"]")
	WebElement Dependants;
	
	public void NumberOfDependants()
	{
		Dependants.click();
		 s.selectByIndex(0);
		
		 
	}
	
	
	@FindBy(xpath="(//label[@class=\"btn\"])[3]")
	WebElement HomeToLiveIn;
	
	public void PropertyTypeHomeToLiveIn()
	{
		HomeToLiveIn.click();
	}
	
	
			@FindBy(xpath="//input[@aria-describedby=\"q2q1i1 q2q1i2\"]")
			WebElement AnnualIncome;
			
			public void YourAnnualIncome()
			{
				AnnualIncome.sendKeys("80000");
			}
	
			
			@FindBy(xpath="//input[@aria-describedby=\"q2q2i1 q2q2i2\"]")
			WebElement AnnualOtherIncome;
			
			public void YourAnnualOtherIncome()
			{
				AnnualOtherIncome.sendKeys("10000");
			}
	
			
			@FindBy(xpath="//input[@id=\"expenses\"]")
			WebElement LivingExpences;
			
			public void YourLivingExpences()
			{
				LivingExpences.sendKeys("500");
			}
			
			
			
			@FindBy(xpath="//input[@id=\"homeloans\"]")
			WebElement HomeLoanRepayment;
			
			public void CurrentHomeloanMonthlyRepaymentsTooltip()
			{
				HomeLoanRepayment.sendKeys("0");
			}
			
			
			@FindBy(xpath="//input[@id=\"otherloans\"]")
			WebElement OthreLoanRepayment;
			
			public void OtherLoanMonthlyPayments()
			{
				OthreLoanRepayment.sendKeys("100");
			}
			
			
			@FindBy(xpath="//input[@aria-describedby=\"q3q4i1 q3q4i2\"]")
			WebElement OtherCommitments;
			
			public void OtherMonthlyCommitments()
			{
				OtherCommitments.sendKeys("0");
			}
			
			
			@FindBy(xpath="//input[@id=\"credit\"]")
			WebElement CreditCardLimit;
			
			public void TotalCreditCardLimit()
			{
				CreditCardLimit.sendKeys("10000");
			}
			
			
			@FindBy(xpath="//button[@id=\"btnBorrowCalculater\"]")
			WebElement WorkOutButton;
			
			public void WorkOutButton()
			{
				WorkOutButton.click();
			}
			
			
			
			@FindBy(xpath="//span[@id=\"borrowResultTextAmount\"]")
			WebElement EstimateCouldBorrow;
			
			public String YourEstimateCouldBorrow()
			{
				String Estimate = EstimateCouldBorrow.getText();
						return Estimate;
				
			}
			
			
			// StartOver
				@FindBy(xpath="(//button[@class=\"start-over\"])[1]")
				WebElement StartOver;
					
				public void ClickOnStartOver()
					{
					StartOver.click();
					}
			
			
		//Entering Only $1 for Living Expenses
				
		@FindBy(xpath="//input[@id=\"expenses\"]")
	    WebElement LivingExpenses;
				
		 public void LivingExpenses1$()
			{
			 LivingExpenses.sendKeys("1");
			}		
				
		//Return the message 
		 
		 @FindBy(xpath="//div[@class=\"borrow__error__text\"]")
			WebElement ReturnMessage;
			
			public String ReturnMessage()
			{
				String message = ReturnMessage.getText();
						return message;
				
			}
		 
				
			
	public CalculatorAndToolPOMclass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	
		 s  = new Select(Dependants);
		
	}
	
	
	
	
	
	
	
	
	
}
