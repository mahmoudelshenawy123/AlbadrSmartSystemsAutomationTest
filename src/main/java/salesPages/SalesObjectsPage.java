package salesPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesObjectsPage extends SalesPageBase{
	String addedQuantity= "10";
	String productName = "صنف غير شامل 2";
	public SalesObjectsPage(WebDriver driver) {
		super(driver);
		Actions builder; 
	}

	@FindBy(xpath = "//*[@class='loading_prog']")WebElement pageLoad;//the page waits until it start to work so we should know it is ready by this element
	//****** added product *******
	@FindBy(xpath="//*[@id=\"autocomplete_sales\"]")WebElement productNameTxt; //that is the product we add .
	@FindBy(xpath = "//*[@id=\"about\"]")WebElement productDetailsTxt;
	@FindBy(xpath="//*[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li")WebElement productNametxtbtn; // here we choose the item we add from the check box that shows
	@FindBy(xpath="//*[@id=\"quant1\"]")WebElement quantityTxt; // the quantity of the item we add
	@FindBy(xpath="//*[@id=\"new_record\"]")WebElement addingProductToBillBtn; // the button which we add item to the bill with
	@FindBy(xpath="//*[@id=\"price1\"]")WebElement productSellingPriceTxt; // product price while adding to the bill .

	//****** added product *******


	//******  product details after adding to the bill (the bill section)  ***********

	//	@FindBy(xpath="//*[@id=\"view_rows\"]/tr[1]/td[1]")WebElement productNameInTheBillTxt; //that is the product in the bill which is already added .
	//	@FindBy(xpath = "//*[@id=\"view_rows\"]/tr[1]/td[2]")WebElement productBillDescriptionTxt; // product bill description .
	//	@FindBy(xpath = "//*[@id=\"qt1\"]")WebElement productBillQuantityTxt; // product quantity in the bill .
	//	@FindBy(xpath = "//*[@id=\"rowprice1\"]")WebElement productPriceInTheBillTxt; // product price in the bill .
	//	@FindBy(xpath = "//*[@id=\"tot1\"]")WebElement productTotalPriceTxt ; // the total price of the product .

	//******  product details after adding to the bill (the bill section)  ***********

	//****** page  details   ***********

	@FindBy(xpath = "//*[@id=\"order_total\"]")WebElement billTotalPriceAddinTaxesTxt; // the total price of the bill Before adding additional values.
	@FindBy(xpath = "//span[@id='order_disc']")WebElement billTotalnetPriceAddinTaxesTxt ; // the total price of the bill After adding additional values.
	@FindBy(xpath = "//input[@id='payment']")WebElement amountOfPayiedMoneyTxt; // the amount of the money we paid
	@FindBy(xpath = "//*[@id=\"submit\"]")WebElement SubmitBtn; // Create Bill btn

	//****** page  details   ***********



	public void addProduct() throws InterruptedException {
		Thread.sleep(2000);
		productNameTxt.sendKeys(productName);// the variable'productName' is in the top of the page i create it variable so i can take the value after

//		productNametxtbtn.click();
//
//		quantityTxt.sendKeys(addedQuantity); // the variable'addedQuantity' is in the top of the page i create it variable so i can take the value after
//		addingProductToBillBtn.click();	
	}
	public void saveBill() {
		SubmitBtn.click();
	}
	// there are the values that we will send the test page to assert 
	public String [] productValuesBeforeAddingToTheBill=
		{
				productNameTxt.getText()
				,productDetailsTxt.getText()
				,addedQuantity
				,productSellingPriceTxt.getText()
		};

	// there are the values that we will send the test page to assert 


	//	public String[] productValuesAfterAddingToTheBill = 
	//		{
	//				productNameInTheBillTxt.getText()
	//				,productBillDescriptionTxt.getText()
	//				,productBillQuantityTxt.getText()
	//				,productPriceInTheBillTxt.getText()
	//				,productTotalPriceTxt.getText()
	//				
	//	};
	public String[] billDetatils = {
			billTotalPriceAddinTaxesTxt.getText()
			,billTotalnetPriceAddinTaxesTxt.getText()
			,amountOfPayiedMoneyTxt.getText()
	};
}
