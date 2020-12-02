package salesTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import salesPages.HomePage;
import salesPages.SalesObjectsPage;

public class OpenSalesPageTest extends SalesTestBase{
	HomePage home;
	SalesObjectsPage  salesobjects;
	public String[] val;

	@Test
	public void openSalesPage() throws InterruptedException {
		home=new HomePage(driver);
		home.OpenSalesPoint();
	}
	@Test(dependsOnMethods = "openSalesPage")
	public void addProductToBill() throws InterruptedException, AWTException {
		salesobjects=new SalesObjectsPage(driver);
		val=salesobjects.addProduct();
		Thread.sleep(2000);


	}


	@Test(dependsOnMethods = "addProductToBill")
	public void assertProductDetailsTrue() throws InterruptedException, AWTException {

		String productNameTxtBeforeAddingToBill= val[0];
		String productDetailsBeforeAddingToBillTxt= val[1];
		String addedQuantityBeforeAddingToBill= val[2];
		String productSellingPriceBeforeAddingToBillTxt= val[3];
		System.out.println
		("productNameTxtBeforeAddingToBill :"+productNameTxtBeforeAddingToBill+"\n"
				+"productDetailsBeforeAddingToBillTxt :"+productDetailsBeforeAddingToBillTxt+"\n"
				+"addedQuantityBeforeAddingToBill :"+addedQuantityBeforeAddingToBill+"\n"
				+"productSellingPriceBeforeAddingToBillTxt :"+productSellingPriceBeforeAddingToBillTxt);

		String productNameTxtAfterAddingToBill = salesobjects.sumbitAddingProductToBill()[0];
		String productBillDescriptionAfterAddingTxt = salesobjects.sumbitAddingProductToBill()[1];
		String addedQuantityAfterAddingToBill = salesobjects.sumbitAddingProductToBill()[2];
		double addedQuantityAfterAddingToBillNum=Double.parseDouble(addedQuantityAfterAddingToBill);
		String productSellingPriceAfterAddingToBillTxt = salesobjects.sumbitAddingProductToBill()[3];
		double productSellingPriceAfterAddingToBillNum=Double.parseDouble(productSellingPriceAfterAddingToBillTxt);

		String productTotalPriceOfTheProductTxt = salesobjects.sumbitAddingProductToBill()[4];

		System.out.println
		(productNameTxtAfterAddingToBill+"\n" 
				+"productBillDescriptionAfterAddingTxt :"+productBillDescriptionAfterAddingTxt+"\n"
				+"addedQuantityAfterAddingToBill :"+addedQuantityAfterAddingToBill+"\n"
				+"productSellingPriceAfterAddingToBillTxt :"+productSellingPriceAfterAddingToBillTxt+"\n"
				+"productTotalPriceOfTheProductTxt :"+productTotalPriceOfTheProductTxt);

		salesobjects.saveBill();
		Thread.sleep(10000);
		

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(productNameTxtBeforeAddingToBill, productNameTxtAfterAddingToBill,"1");
		softAssert.assertEquals(productDetailsBeforeAddingToBillTxt,productBillDescriptionAfterAddingTxt,"2");
		softAssert.assertEquals(addedQuantityBeforeAddingToBill,addedQuantityAfterAddingToBill,"3");
		softAssert.assertEquals(productSellingPriceBeforeAddingToBillTxt,productSellingPriceAfterAddingToBillTxt,"4");
		softAssert.assertEquals(Double.parseDouble(productTotalPriceOfTheProductTxt), (addedQuantityAfterAddingToBillNum*productSellingPriceAfterAddingToBillNum));
		System.out.println(addedQuantityAfterAddingToBillNum*productSellingPriceAfterAddingToBillNum);
		softAssert.assertAll();

	}



}
