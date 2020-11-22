package salesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SalesPageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[contains(text(),'المبيعات')]")WebElement SalesSideNavBarBtn;
	@FindBy(xpath="//*[contains(text(),' نقطة  البيع ')]")WebElement SellingPointBtn;
//	@FindBy(xpath="")WebElement ;
//	@FindBy(xpath="")WebElement ;
//	@FindBy(xpath="")WebElement ;
//	@FindBy(xpath="")WebElement ;
//	@FindBy(xpath="")WebElement ;

	
	public void OpenSalesPoint() throws InterruptedException {
		SalesSideNavBarBtn.click();
		SellingPointBtn.click();
	}
	
	
	
}
