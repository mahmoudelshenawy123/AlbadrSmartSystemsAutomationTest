package salesTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import salesPages.HomePage;
import salesPages.SalesObjectsPage;

public class OpenSalesPageTest extends SalesTestBase{
	HomePage home;
	SalesObjectsPage  salesobjects;
	
	@Test
	public void openSalesPage() throws InterruptedException {
		home=new HomePage(driver);
		home.OpenSalesPoint();
		
	}
	@Test 
	public void paas() throws AWTException {
		WebElement prod=driver.findElement(By.xpath("//input[@id='autocomplete_sales']"));
		prod.click();
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value='صنف غير شامل 2';",prod);
		//prod.click();
	//	prod.sendKeys(	"صنف غير شامل 2");
		//*[@id="barcode"]//*[@id="autocomplete_sales"]
//	@Test(dependsOnMethods = "openSalesPage")
//	public void addProductToTheBill() throws InterruptedException {
//		salesobjects=new SalesObjectsPage(driver);
//		salesobjects.addProduct();
//		Thread.sleep(2000);
//		String productNameBeforeAddingToTheBill= salesobjects.productValuesBeforeAddingToTheBill[0];
//		String productDetailsBeforeAddingToTheBill= salesobjects.productValuesBeforeAddingToTheBill[1];
//		String productQuantityBeforeAddingToTheBill= salesobjects.productValuesBeforeAddingToTheBill[2];
//		String productSellingPriceBeforeAddingToTheBill= salesobjects.productValuesBeforeAddingToTheBill[3];
//		
//		System.out.println(productNameBeforeAddingToTheBill+"\n"+productDetailsBeforeAddingToTheBill+"\n"
//		+productQuantityBeforeAddingToTheBill+"\n"+productSellingPriceBeforeAddingToTheBill);
	}
	

}
