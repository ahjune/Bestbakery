package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCarts {
	@FindBy(xpath="/html/body/div[1]/div/div/div[4]/div[2]/a[1]")
	WebElement viewcartbtn;
	@FindBy(xpath="//*[@id=\"inner_content-3-10564\"]/div/div[4]/div/div/div[3]/div[3]/div[2]/a/span")
	WebElement proceedbtn;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/span[2]")
	WebElement cart_two_btn;
	
	
	
	public ViewCarts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void viewcart() throws InterruptedException {
		Thread.sleep(3000);
		viewcartbtn.click();
		proceedbtn.click();
		cart_two_btn.click();
		
		
	}

}
