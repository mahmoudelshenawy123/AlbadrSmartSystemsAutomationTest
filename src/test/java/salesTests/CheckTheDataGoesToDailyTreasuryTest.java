package salesTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import salesPages.CheckTheDataGoesToDailyTreasuryPage;
import salesPages.HomePage;
import salesPages.SalesObjectsPage;

public class CheckTheDataGoesToDailyTreasuryTest {
	
	WebDriver driver; 
//	HomePage home;
//	CheckTheDataGoesToDailyTreasuryPage trea ;
//	SalesObjectsPage sales;


	public void assertDataIstrueInTreasuryPage(WebDriver driver) {

//		home.openDailyTreasuryPage();		
		System.out.println("2");

		System.out.println("payiedMoneyInTreasuryTxt");
//		CheckTheDataGoesToDailyTreasuryPage trea=new  CheckTheDataGoesToDailyTreasuryPage(driver);
//		String payiedMoneyInTreasuryTxt = trea.assertDataTransferedIsTrue()[0];
//		String billNumberInTreasuryTxt = trea.assertDataTransferedIsTrue()[1];
//		String clientNameInTreasuryTxt = trea.assertDataTransferedIsTrue()[2];
//		System.out.println("2");
//		System.out.println("payiedMoneyInTreasuryTxt" + payiedMoneyInTreasuryTxt+ "%n" +"billNumberInTreasuryTxt"+billNumberInTreasuryTxt
//				+"%n"+"clientNameInTreasuryTxt"+clientNameInTreasuryTxt);

		SalesObjectsPage sales =new SalesObjectsPage(driver);
		String payiedMoneyInSalesPageTxt = sales.assertionData()[0];
		String billNumberInSalesPageTxt = sales.assertionData()[1];
		String clientNameInSalesPageTxt = sales.assertionData()[2];
		System.out.println("payiedMoneyInSalesPageTxt" + payiedMoneyInSalesPageTxt + "\n" +"billNumberInSalesPageTxt"+billNumberInSalesPageTxt
				+"\n"+"clientNameInSalesPageTxt"+clientNameInSalesPageTxt);
		
	}


}
