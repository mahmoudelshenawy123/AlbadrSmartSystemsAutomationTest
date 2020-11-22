package updateSalesTests;

import org.testng.annotations.Test;

import updateSalesPages.CategoriesPage;

public class CategoryPageTest extends TestBase{
	
	
	
	CategoriesPage CatPage;
	
	
	@Test 
	public void OpenCategoryPageTest() {
		CatPage = new CategoriesPage(driver);
		CatPage.OpenCategoryPage();
	}

}
             