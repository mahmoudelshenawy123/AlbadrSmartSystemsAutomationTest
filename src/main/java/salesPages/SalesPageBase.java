package salesPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SalesPageBase {
	WebDriver driver;
	public SalesPageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Actions builder;
	}

}
