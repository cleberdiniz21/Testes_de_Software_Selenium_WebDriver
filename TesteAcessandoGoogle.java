package testeSelenium;

import java.io.Closeable;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAcessandoGoogle {
	
	
	@Test
	public void testeAcessandoGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleber Diniz\\Desktop\\Driver\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();				
	}
	
	@Test
	public void testeAcessandoBing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleber Diniz\\Desktop\\Driver\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com/");
		Assert.assertEquals("Bing", driver.getTitle());
		driver.quit();				
	}
	
	@Test
	public void testeAcessandoGoogleEFazendoUmaPesquisa() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleber Diniz\\Desktop\\Driver\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		driver.findElementByName("q").click();
		
		driver.quit();
	}
}
