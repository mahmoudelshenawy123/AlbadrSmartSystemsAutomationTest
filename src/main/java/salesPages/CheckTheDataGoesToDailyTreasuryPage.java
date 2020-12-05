package salesPages;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckTheDataGoesToDailyTreasuryPage extends SalesPageBase{

	public CheckTheDataGoesToDailyTreasuryPage(WebDriver driver) {
		super(driver);
	}
	
		
//	
//	List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"left_content\"]/table/tbody/tr"));
//	int rowNum =rows.size();
//	WebElement payiedMoneyTxt =driver.findElement(By.xpath("//*[@id=\"left_content\"]/table/tbody/tr["+rowNum+"]/td[3]"));
//	WebElement billNumberTxtArea =driver.findElement(By.xpath("//*[@id='left_content']/table/tbody/tr["+rowNum+"]/td[6]/a[1]"));
//	WebElement clientNameTxt =driver.findElement(By.xpath("//*[@id='left_content']/table/tbody/tr["+rowNum+"]/td[6]/a[2]"));
//	WebElement userNameTxt =driver.findElement(By.xpath("//*[@id='left_content']/table/tbody/tr["+rowNum+"]/td[7]"));

	
	
	public String[] assertDataTransferedIsTrue() {
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"left_content\"]/table/tbody/tr"));
		int rowNum =rows.size();
		WebElement payiedMoneyTxt =driver.findElement(By.xpath("//*[@id=\"left_content\"]/table/tbody/tr["+rowNum+"]/td[3]"));
		WebElement billNumberTxtArea =driver.findElement(By.xpath("//*[@id='left_content']/table/tbody/tr["+rowNum+"]/td[6]/a[1]"));
		WebElement clientNameTxt =driver.findElement(By.xpath("//*[@id='left_content']/table/tbody/tr["+rowNum+"]/td[6]/a[2]"));
		WebElement userNameTxt =driver.findElement(By.xpath("//*[@id='left_content']/table/tbody/tr["+rowNum+"]/td[7]"));

		
		
		String billNumberTxt= billNumberTxtArea.getText().substring(12);
		
		String[] SendData = {
				payiedMoneyTxt.getText(),
				billNumberTxt,
				clientNameTxt.getText(),
				userNameTxt.getText()
		};
		return SendData ;
	}

}

