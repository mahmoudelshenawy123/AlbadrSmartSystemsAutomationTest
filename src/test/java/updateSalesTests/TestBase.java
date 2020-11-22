package updateSalesTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	WebElement userNameTxt;
	WebElement passTxt;
	WebElement loginBtn;

	@BeforeTest
	public void openAlbadrWebSite() {
		String urlPath=	System.getProperty("user.dir")+"\\drivers\\chromedriver1.exe";
		System.setProperty("webdriver.chrome.driver", urlPath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://albadrsales.com/demo-29/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userNameTxt=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		passTxt=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		loginBtn=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		userNameTxt.sendKeys("demo2");
		passTxt.sendKeys("123456");
		loginBtn.click();
	}

	

	//	@AfterClass
	//	public void closeUrl() {
	//		driver.quit();
	//	}

}
