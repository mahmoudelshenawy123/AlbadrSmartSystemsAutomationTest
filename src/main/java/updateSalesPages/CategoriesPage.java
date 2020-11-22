package updateSalesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends PageBase{

	public CategoriesPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//*[/html/body/div[4]/div[3]/div[1]/nav/div[2]/a and text()=' الأصناف']")WebElement CategoryMenuButton;
	@FindBy(xpath=	"/html/body/div[4]/div[3]/div[1]/nav/div[2]/div and text()= ' الأصناف'" +"") WebElement OpenAllCategoryPaegButton;
	
	
	public void OpenCategoryPage() {
		CategoryMenuButton.click();
		OpenAllCategoryPaegButton.click();
	}
	
}
