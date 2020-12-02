package salesPages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SalesObjectsPage extends SalesPageBase{
	String addedQuantity= "1";
	String productName = "صنف";
	JavascriptExecutor js;
	Actions builder; 

	public SalesObjectsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@class='loading_prog']")WebElement pageLoad;//the page waits until it start to work so we should know it is ready by this element
	//****** added product *******
	@FindBy(xpath="//*[@id=\"autocomplete_sales\"]")WebElement productNameTxt; //that is the product we add .
	@FindBy(xpath = "//*[@id=\"about\"]")WebElement productDetailsTxt;
	@FindBy(xpath="//*[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//li//div[text()='صنف معفى 2']")WebElement productNametxtbtn; // here we choose the item we add from the check box that shows
	@FindBy(xpath="//*[@id=\"quant1\"]")WebElement quantityTxt; // the quantity of the item we add
	@FindBy(xpath="//*[@id=\"new_record\"]")WebElement addingProductToBillBtn; // the button which we add item to the bill with
	@FindBy(xpath="//*[@id=\"price1\"]")WebElement productSellingPriceTxt; // product price while adding to the bill .

	
	public String[] addProduct() throws InterruptedException {
  
		productNameTxt.sendKeys(productName); // the variable'productName' is in the top of the page i create it variable so i can take the value after		
		productNametxtbtn.click();
		quantityTxt.sendKeys(addedQuantity); // the variable'addedQuantity' is in the top of the page i create it variable so i can take the value after
		 String [] productValuesBeforeAddingToTheBill=
			{
					productNameTxt.getAttribute("value")
					,productDetailsTxt.getAttribute("value")
					,addedQuantity
					,productSellingPriceTxt.getAttribute("value")
			};
			addingProductToBillBtn.click();	

		return productValuesBeforeAddingToTheBill;
	}
	//****** added product *******


	
	//******  product details after adding to the bill (the bill section)  ***********
	
	
		@FindBy(xpath="//*[@id=\"view_rows\"]/tr[1]/td[1]")WebElement productNameInTheBillTxt ; //that is the product in the bill which is already added .
	@FindBy(xpath = "//*[@id=\"view_rows\"]/tr[1]/td[2]")WebElement productBillDescriptionTxt ; // product bill description .
	@FindBy(xpath = "//*[@id=\"qt1\"]")WebElement productBillQuantityTxt ; // product quantity in the bill .
	@FindBy(xpath = "//*[@id=\"rowprice1\"]")WebElement productPriceInTheBillTxt ; // product price in the bill .
	@FindBy(xpath = "//*[@id=\"tot1\"]")WebElement productTotalPriceTxt ; // the total price of the product .

	
	public String[] sumbitAddingProductToBill(){
		 String[] productValuesAfterAddingToTheBill = 
			{
					productNameInTheBillTxt.getText()
					,productBillDescriptionTxt.getText()
					,productBillQuantityTxt.getAttribute("value")
					,productPriceInTheBillTxt.getText()
					,productTotalPriceTxt.getText()

			};
		return productValuesAfterAddingToTheBill;
	}
	//******  product details after adding to the bill (the bill section)  ***********

	//****** page  details   ***********

	@FindBy(xpath = "//*[@id=\"order_total\"]")WebElement billTotalPriceAddinTaxesTxt; // the total price of the bill Before adding additional values.
	@FindBy(xpath = "//span[@id='order_disc']")WebElement billTotalnetPriceAddinTaxesTxt ; // the total price of the bill After adding additional values.
	@FindBy(xpath = "//input[@id='payment']")WebElement amountOfPayiedMoneyTxt; // the amount of the money we paid
	@FindBy(xpath = "//*[@id=\"submit\"]")WebElement SubmitBtn; // Create Bill Button
	
	public String[] billDetatils = {
			billTotalPriceAddinTaxesTxt.getText()
			,billTotalnetPriceAddinTaxesTxt.getText()
			,amountOfPayiedMoneyTxt.getText()
	};
	
	
	//****** page  details   ***********


	
	@FindBy(xpath="//*[@id=\"sales_show\"]/tr[2]/td")WebElement billNumberId;
	public void saveBill() {
		SubmitBtn.click();
//		billNumberId.getText().substring(5);
	}
	// there are the values that we will send the test page to assert 


	// there are the values that we will send the test page to assert 

	
}
