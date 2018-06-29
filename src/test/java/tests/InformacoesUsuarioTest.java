package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
  @Test
  public void testAdicionarUmainformacaoAdicionalDoUsuario(){
    // Abrindo o Navegador
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\jefferson.santana\\Drivers\\chromedriver.exe");
    WebDriver navegador = new ChromeDriver();

    // navegando para a pagina do taskit
    navegador.get("https://www.bbc.com/portuguese");

    //Clicar no Link que possui o texto "Sign in"
    navegador.findElement(By.linkText("Sign in")).click();

    // Digitar no campo nome "Login"
    navegador.findElement(By.id("user-identifier-input")).sendKeys("teste@teste.com");

    navegador.findElement(By.id("password-input")).sendKeys("99999999");

    navegador.findElement(By.id("submit-button")).click();

    WebElement mensagem = navegador.findElement(By.className("form-message__text"));

    String msgerro = mensagem.getText();

    assertEquals("Sorry, that password isn't valid. Please include a letter.", msgerro);

    dri

  }
}
