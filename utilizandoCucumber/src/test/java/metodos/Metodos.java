package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("*********Causa do Erro*********" + e.getCause());
			System.err.println("*********Tipo de Erro***********" + e.getMessage());
		}

	}

	public void validarTexto(By elemento, String mensagemEsperada) {
		try {
			String textoCapturado;
			if (mensagemEsperada.equals("https://www.saucedemo.com/inventory.html")) {
				textoCapturado = driver.getCurrentUrl();
			} else {
				textoCapturado = driver.findElement(elemento).getText();
			}
			assertEquals(textoCapturado, mensagemEsperada);

		} catch (Exception e) {
			System.err.println("*********Causa do Erro*********" + e.getCause());
			System.err.println("*********Tipo de Erro***********" + e.getMessage());
		}

	}
}
