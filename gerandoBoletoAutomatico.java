package testeSelenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class gerandoBoletoAutomatico {
	
	@Test	
	public void boletoAutomatico() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleber Diniz\\Desktop\\Driver\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.sicadi.com.br/mhouse/boleto/geraboleto.php");
//		Assert.assertEquals("Google", driver.getTitle());
//		driver.findElementByName("q").sendKeys("gerar boleto fake");
//		Thread.sleep(1000);
//		driver.findElementByName("btnK").click();
//		Para localizar elementos do tipo texto usar xpath =>//h3[text()="nome do elemento"]
//		Para localizar elementos do tipo tag //tag[@class="Teste de geração de boleto"]
//		driver.findElementBy.("Teste de geração de boleto").click();
		driver.findElementById("cedente").clear();
		Thread.sleep(1000);
		driver.findElementById("cedente").sendKeys("Automação de Teste de Software");
		driver.findElementById("data_documento").clear();
		driver.findElementById("data_documento").sendKeys("31/12/2021");
		driver.findElementById("numero_documento").clear();
		driver.findElementById("numero_documento").sendKeys("Doc_Teste_001");
		driver.findElementById("especie").sendKeys("Testes_Automatizados");
		driver.findElementById("carteira").clear();
		driver.findElementById("carteira").sendKeys("Testes");
		driver.findElementById("aceite").clear();
		driver.findElementById("aceite").sendKeys("Sim");
		driver.findElementById("vencimento").clear();
		driver.findElementById("vencimento").sendKeys("31/12/2021");
		driver.findElementById("valor_documento").clear();
		driver.findElementById("valor_documento").sendKeys("10.000");
		driver.findElementById("sacado").sendKeys("O intuito do Teste é de Treinamento e demonstração de Automação de paginas web!!!");
		driver.findElementById("meunumero").clear();
		driver.findElementById("meunumero").sendKeys("0001");
		driver.findElementById("instrucoes").clear();
		driver.findElementById("instrucoes").sendKeys("Não cobrar juros!!!");
		driver.findElementByName("Submit").click();
		driver.quit();
		}
}
