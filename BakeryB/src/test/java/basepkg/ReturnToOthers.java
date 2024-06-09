package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnToOthers {
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/div/a")
	WebElement return_shopping_btn;
	@FindBy(xpath="//*[@id=\"menu-item-11373\"]/a")
	WebElement about_label;
	@FindBy(xpath="//*[@id=\"menu-item-11371\"]/a/span")
	WebElement acc_label;
	
	public ReturnToOthers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void postrun() throws InterruptedException {
		Thread.sleep(3000);
		return_shopping_btn.click();
		about_label.click();
		acc_label.click();
	}
}
