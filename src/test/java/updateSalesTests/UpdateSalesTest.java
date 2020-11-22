package updateSalesTests;


import org.testng.annotations.Test;

import updateSalesPages.UpdateSalesPage;

public class UpdateSalesTest extends TestBase{
	UpdateSalesPage sales;
	
	String ProductName= "صنف غير شامل 2";
	@Test
	public void AddProductTest() throws InterruptedException {
		sales= new UpdateSalesPage(driver);
		sales.OpenSalesPage();
		
		String TotalPricetxtBeforeAddingTxt=sales.assertionDataBeforeAddingElements()[0];
		String TotalNetPriceBeforeAddingTxt=sales.assertionDataBeforeAddingElements()[1];
		String BillStatusBeforeAddingTxt= sales.assertionDataBeforeAddingElements()[2];
		System.out.println(TotalPricetxtBeforeAddingTxt +"\n"+ TotalNetPriceBeforeAddingTxt+"\n" +BillStatusBeforeAddingTxt);
		
		
	}
	
	@Test(dependsOnMethods = "AddProductTest")
	public void adding() throws InterruptedException {
		sales.AddProductToPage(ProductName);
	}
	
	@Test(dependsOnMethods = "AddProductTest")
	public void ChangeMoneyPaiedTest() {
		sales.ChangePayiedMoneyAmount();
	}
	
	@Test(dependsOnMethods = "ChangeMoneyPaiedTest")
	public void AssertBillDataTrue() {
			
		String TotalPricetxtAfterAddingTxt=sales.assertionDataBeforeAddingElements()[0];
		String TotalNetPriceAfterAddingTxt=sales.assertionDataBeforeAddingElements()[1];
		String BillStatusAfterAddingTxt= sales.assertionDataBeforeAddingElements()[2];
		System.out.println(TotalPricetxtAfterAddingTxt +"\n"+ TotalNetPriceAfterAddingTxt+"\n" +BillStatusAfterAddingTxt);
	
	}

}
