package updateSalesPages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	Actions action;
	JavascriptExecutor js;
	public PageBase(WebDriver driver){
		PageFactory.initElements(driver, this);

	}

}
