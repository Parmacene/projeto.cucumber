package steps;

import org.openqa.selenium.By;

import drivers.Drivers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Navegador;

public class ExecutarTeste extends Drivers {

	By username = By.id("user-name");
	By senha = By.id("password");
	By BtnLogin = By.id("Login-button");
	By msgCaptada = By.xpath("//h3[@data-test='error']");

	Metodos metodo = new Metodos();

	@Given("que desejo realizar o login na aplicacao")
	public void que_desejo_realizar_o_login_na_aplicacao() {
		Navegador.abrirNavegador();
		
	}

	@When("informar o {string}")
	public void informar_o(String string) {
		metodo.escrever(username, string);
		
	}

	@When("informar a {string}")
	public void informar_a(String string) {
		metodo.escrever(senha, string);
	
	}

	@When("e clicar no botao login")
	public void e_clicar_no_botao_login() {
		metodo.clicar(BtnLogin);
		
	}

	@Then("valido o {string} de acordo com dados de login")
	public void valido_o_de_acordo_com_dados_de_login(String string) {
		metodo.validarTexto(msgCaptada, string);
		Navegador.fecharNavegador();
	}

}