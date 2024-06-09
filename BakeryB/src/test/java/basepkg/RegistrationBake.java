package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationBake {
	
ChromeDriver driver;
	
	@FindBy(xpath="//*[@id=\"reg_email\"]")
	WebElement emailreg;
	@FindBy(xpath="//*[@id=\"reg_password\"]")
	WebElement passwdreg;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/form/p[3]/button")
	WebElement registerbtn;
	
	public RegistrationBake(WebDriver driver) {
		this.driver=(ChromeDriver) driver;
		PageFactory.initElements(driver, this);
	}

	public void regpass() {
		// TODO Auto-generated method stub
		emailreg.sendKeys("testjunkie79@gmail.com");
		passwdreg.sendKeys("samsungs24ultra!");
		registerbtn.click();
	}
	

}
