package updateSalesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateSalesPage extends PageBase{

	public UpdateSalesPage(WebDriver driver) {
		super(driver);
	}




	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]")WebElement TotalPriceTxtBox;
	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]")WebElement TotalNetPriceTxtBox;




	@FindBy(xpath = "//*[text()='المبيعات ']")WebElement SaleSideBtn;
	@FindBy(xpath = "/html/body/div[4]/div[3]/div[1]/nav/div[2]/div[1]/a[10] ")WebElement NewBillSalesPageBtn;
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/table/tbody/tr[1]/td[5]/a")WebElement BillPageBtn;
	String TotalPriceBeforeAddingProductTxt;
	String TotalNetPriceBeforeAddingProductTxt;

	public void OpenSalesPage() {
		SaleSideBtn.click();
		NewBillSalesPageBtn.click();	
		BillPageBtn.click();
		TotalPriceBeforeAddingProductTxt =TotalPriceTxtBox.getText().substring(10);
		TotalNetPriceBeforeAddingProductTxt =TotalNetPriceTxtBox.getText().substring(8);
		System.out.println("TotalPriceBeforeAddingProductTxt "+TotalPriceBeforeAddingProductTxt);
		System.out.println("TotalNetPriceBeforeAddingProductTxt "+TotalNetPriceBeforeAddingProductTxt);


	}


	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/a")WebElement AddProductBtn;
	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[1]/td/div/div/div/div[1]/div/span/input[2]")WebElement ProductNameTxtBox; 
	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[1]/td/div/div/div/div[1]/div/span/pre")WebElement AreaOfAddedProductsWhileAddingProducts;
	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[1]/td/div/div/div/div[1]/div/span/div/div/a[1]")WebElement FirstVisibleElementWhileAddingProducts;
	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[1]/td/div/div/div/div[5]/a")WebElement ConfirmAddedProductBtn;

	String TotalPriceAfterAddingProductTxt ;
	String TotalNetPriceAfterAddingProductTxt;


	public void AddProductToPage(String productName) throws InterruptedException {
		AddProductBtn.click();
		ProductNameTxtBox.sendKeys(productName);
		Thread.sleep(3000);
		FirstVisibleElementWhileAddingProducts.click();
		Thread.sleep(1000);
		ConfirmAddedProductBtn.click();
		//		TotalPriceAfterAddingProductTxt =TotalPriceTxtBox.getText().substring(10);
		//		TotalNetPriceAfterAddingProductTxt =TotalNetPriceTxtBox.getText().substring(8);	
		//		System.out.println("TotalPriceAfterAddingProductTxt "+TotalPriceAfterAddingProductTxt);
		//		System.out.println("TotalNetPriceAfterAddingProductTxt "+TotalNetPriceAfterAddingProductTxt);

	}
	@FindBy(xpath = "/html/body/div[5]/form/div[3]/div/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/input")WebElement TotalPaiedMoneyAmounntTxtBox;

	public void ChangePayiedMoneyAmount() {
		TotalPriceAfterAddingProductTxt =TotalPriceTxtBox.getText().substring(10);
		TotalNetPriceAfterAddingProductTxt =TotalNetPriceTxtBox.getText().substring(8);	
		TotalPaiedMoneyAmounntTxtBox.clear();
		TotalPaiedMoneyAmounntTxtBox.sendKeys(TotalNetPriceAfterAddingProductTxt);		
	}
	@FindBy(xpath="//*[@id=\"all_total_text\"]")WebElement TotalPriceText;
	@FindBy(xpath="//*[@id=\"net_text\"]")WebElement NetPriceText;
	@FindBy(xpath="//*[contains(text(),'الفاتورة:')]")WebElement BillStatus;

	public String[] assertionDataBeforeAddingElements() {
		String TotalTextBeforeAddingElement=TotalPriceText.getText().substring(10);
		String TotalNetTextBeforeAddingElement=NetPriceText.getText().substring(8);
		String BillStatusText= BillStatus.getText().substring(10);
		String[] BillAssertionDataBeforeAddingText = {TotalTextBeforeAddingElement,TotalNetTextBeforeAddingElement,BillStatusText};
		return BillAssertionDataBeforeAddingText;
	}
	public String[] assertionDataAfterAddingElements() {
		String TotalTextBeforeAddingElement=TotalPriceText.getText().substring(10);
		String TotalNetTextBeforeAddingElement=NetPriceText.getText().substring(8);
		String BillStatusText= BillStatus.getText().substring(10);
		String[] BillAssertionDataBeforeAddingText = {TotalTextBeforeAddingElement,TotalNetTextBeforeAddingElement,BillStatusText};
		return BillAssertionDataBeforeAddingText;
	}

}




