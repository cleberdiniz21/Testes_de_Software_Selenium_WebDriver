package testeSelenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class acessandoGmail {
	
	@Test
	public void acessoGmailAutomatico() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleber Diniz\\Desktop\\Driver\\ChromeDriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com/");
	driver.findElementById("identifierId").sendKeys("emailteste@gmail.com");
	driver.findElementByClassName("VfPpkd-RLmnJb").click();
	driver.quit();
		
	}
}
