package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartAdding {
	
	@FindBy(xpath="//*[@id=\"-product-cart-button-831-10473-1\"]/form/div/button[2]")
	WebElement plusbtn;
	@FindBy(xpath="//*[@id=\"-product-cart-button-831-10473-1\"]/form/button")
	WebElement addcartbtn;
	
	
	public CartAdding(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void cartprocess() throws InterruptedException {
		
		Thread.sleep(3000);
		plusbtn.click();
		addcartbtn.click();

	}
}
