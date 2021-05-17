package testeSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AcessandoEFazendoesquisaGoogle {

		@Test
		public void testeAcessandoGoogleEFazendoUmaPesquisa() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleber Diniz\\Desktop\\Driver\\ChromeDriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.google.com/");
			Assert.assertEquals("Google", driver.getTitle());
			driver.findElementByName("q").sendKeys("Testes Automatizados");
			Thread.sleep(1000);
			driver.findElementByName("btnK").click();
		    driver.quit();
		}
		
		@Test
		public void testeAcessandoGoogleEClicandoEstouComSorte() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleber Diniz\\Desktop\\Driver\\ChromeDriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.google.com/");
			Assert.assertEquals("Google", driver.getTitle());
			driver.findElementByName("q").sendKeys("Estou com Sorte");
			Thread.sleep(1000);
			driver.findElementByName("btnI").click();
			driver.quit();
		
		}
}
	

