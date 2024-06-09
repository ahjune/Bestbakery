package testpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepkg.BrowseHomePage;
import basepkg.CartAdding;
import basepkg.HyperlinkMyAcc;
import basepkg.LoginBake;
import basepkg.RemoveItems;
import basepkg.ReturnToOthers;
import basepkg.ViewCarts;

public class BMaintest2 {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://bakeryb.com/my-account/");
	}
	
	@Test (priority = 1)
	public void logintest() {
		LoginBake obj1=new LoginBake(driver);
		obj1.loginclick();
	}
	
	@Test (priority = 2)
	public void browseitems() throws InterruptedException {
		BrowseHomePage obj2=new BrowseHomePage(driver);
		obj2.browseoptions();
		driver.navigate().back(); 
		driver.navigate().back(); 
	}
	
	@Test (priority = 3)
	public void cartprocessing() throws InterruptedException {
		CartAdding obj3=new CartAdding(driver);
		obj3.cartprocess();
	}
	
	@Test (priority = 4)
	public void viewcartprocessing() throws InterruptedException {
		ViewCarts obj4=new ViewCarts(driver);
		obj4.viewcart();
	}
	
	@Test (priority = 5)
	public void removals() throws InterruptedException {
		RemoveItems obj5=new RemoveItems(driver);
		obj5.rmitems();
	
}
	@Test (priority = 6)
	public void retvalues() throws InterruptedException {
		ReturnToOthers obj6=new ReturnToOthers(driver);
		obj6.postrun();
	}
	
	@Test (priority = 7)
	public void link() throws InterruptedException {
		HyperlinkMyAcc obj7=new HyperlinkMyAcc(driver);
		obj7.linkstest();	
	}
	
	//logo
	@Test
	public void testlogo() {
		boolean logoPresent = driver.findElement(By.xpath("//*[@id=\"image-7-21\"]")).isDisplayed();
		
		if(logoPresent) {
			System.out.println("present");
		}
		else {
			System.out.println("absent");
		}
	}
	
	//title
	   @Test
	    public void verifyPageTitle() {
	        String actualTitle = driver.getTitle();
	        System.out.println(driver.getTitle());
	        String expectedTitle = "https://bakeryb.com/my-account/"; 
	        Assert.assertEquals(actualTitle, expectedTitle, "The webpage title does not match the expected title.");
	}
	   //response
	   
	   @Test
		public void test() throws IOException {
			List<WebElement> li=driver.findElements(By.tagName("a"));
			System.out.println("total no of links=" +li.size());
			
			for (WebElement link : li) { 
				String links=link.getAttribute("href");
				verify(links);
				
			}
		}

		private void verify(String links) throws IOException {
			// TODO Auto-generated method stub
			try {
				URL ob=new URL(links);
				HttpURLConnection con=(HttpURLConnection)ob.openConnection();
				if(con.getResponseCode()==200) {
					System.out.println("Sucess/ Code 200 generated----------" +links);
				}
				else if(con.getResponseCode()==404) {
					System.out.println("Failed/ Code 404 Not Found----------" +links);
				}
				
			} catch (MalformedURLException e) {
				//NOTHING
				System.out.println("Invalid");

			}
			
		}
	   
	   }
