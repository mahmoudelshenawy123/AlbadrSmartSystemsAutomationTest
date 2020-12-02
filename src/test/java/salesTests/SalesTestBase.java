package salesTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesTestBase {
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeClass
	public void OpenAlbadrAlbadr()  {
		String driverPAth= System.getProperty("user.dir")+"\\drivers\\chromedriver1.exe";
		System.setProperty("webdriver.chrome.driver", driverPAth);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://albadrsales.com/demo-29/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement userNameTxt= driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement passwprdTxt=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		userNameTxt.sendKeys("demo2");
		passwprdTxt.sendKeys("123456");
		loginBtn.click();	

	}
//	@Test
	public void PreConditions() throws InterruptedException  {
		WebElement settingBtn= driver.findElement(By.xpath("//*[contains(text(),' الإعدادات')]"));
		settingBtn.click();
		
		WebElement programSettingsBtn=driver.findElement(By.xpath("//*[text()=' إعدادت البرنامج']"));
		programSettingsBtn.click();
		Thread.sleep(2000);

		WebElement addingQuantityBtn=driver.findElement(By.xpath("//*[@id='enter_quant1']"));
		addingQuantityBtn.click();
//		js.executeScript("arguments[0].click();", addingQuantityBtn);
		WebElement fixedAddingValuesBtn=driver.findElement(By.xpath("//*[@id='bill_add' and @value='1' ]"));// this is no button
		fixedAddingValuesBtn.click();

		Thread.sleep(2000);
		WebElement salesScreenBtn =driver.findElement(By.xpath("//*[@id='screen_type1' and @value='1']"));  //this is choose button 
		salesScreenBtn.click();
		
		Thread.sleep(2000);

		WebElement savingSettingBtn=driver.findElement(By.xpath("//*[contains(text(),'حفظ')] //parent::*[@class='sidebarmenu']"));	
		savingSettingBtn.click();
		
	}
	
	
//	@AfterClass
//	public void ExitBrowser() {
//		driver.quit();
//	}

}