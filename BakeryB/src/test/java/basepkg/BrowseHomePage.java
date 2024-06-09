package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowseHomePage {
	
	@FindBy(xpath="//*[@id=\"code_block-2514-19\"]/button")
	WebElement viewallbtn;
	@FindBy(xpath="//*[@id=\"code_block-806-10473\"]/div/a[2]/div/div")
	WebElement second_item_opt;
	@FindBy(xpath="//*[@id=\"code_block-806-10473\"]/div/a[3]/div/div")
	WebElement third_item_opt;
	
	
	public BrowseHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void browseoptions() throws InterruptedException {
		Thread.sleep(3000);
		viewallbtn.click();
		second_item_opt.click();
		third_item_opt.click();
		
	}
}
