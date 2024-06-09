package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HyperlinkMyAcc {
	
	@FindBy(xpath="//*[@id=\"shortcode-3-15\"]/div/nav/ul/li[1]/a")
	WebElement orders_link;
	@FindBy(xpath="//*[@id=\"shortcode-3-15\"]/div/nav/ul/li[2]/a")
	WebElement address_link;
	@FindBy(xpath="//*[@id=\"shortcode-3-15\"]/div/nav/ul/li[3]/a")
	WebElement acc_details;
	@FindBy(xpath="//*[@id=\"shortcode-3-15\"]/div/nav/ul/li[4]/a")
	WebElement logout_link;
	
	public HyperlinkMyAcc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void linkstest() throws InterruptedException {
		
		Thread.sleep(3000);
		orders_link.click();
		address_link.click();
		acc_details.click();
		logout_link.click();
	}
}
