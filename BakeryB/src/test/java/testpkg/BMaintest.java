package testpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepkg.RegistrationBake;


public class BMaintest {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://bakeryb.com/my-account/");
	}
	
	@Test
	public void logintest() {
		RegistrationBake ob1=new RegistrationBake(driver);
		ob1.regpass();
	}
}
