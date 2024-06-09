package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveItems {
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/span")
	WebElement remove_item_btn;
	
	
	public RemoveItems(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void rmitems() throws InterruptedException {
		Thread.sleep(3000);
		remove_item_btn.click();
		
	}
}