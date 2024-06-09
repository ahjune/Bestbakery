package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBake {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement emaillogin;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement passwdlogin;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/label/span")
	WebElement rememberme;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
	WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"menu-item-10569\"]/a")
	WebElement homemenu;
	
	//constructor
	public LoginBake(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//login button click
	public void loginclick() {
		emaillogin.sendKeys("testjunkie79@gmail.com");
		passwdlogin.sendKeys("samsungs24ultra!");
		rememberme.click();
		loginbtn.click();
		homemenu.click();
	}
}