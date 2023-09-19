package primeiroTest;

import org.openqa.selenium.By;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Navegador;

public class PrimeiroTest {
	
	By username = By.id("user-name");
	By senha = By.id("password");
	By BtnLogin = By.id("Login-button");
	
	
	Metodos metodo = new Metodos ();	
	@Before
	public void iniciarTest() {
		Navegador.abrirNavegador();
		
	}
	
	@Given("que nao esteja logado")
	public void que_nao_esteja_logado() {

	}

	@When("preencho o usuario")
	public void preencho_o_usuario() {
		metodo.escrever(username, "standard_user");
	
	}

	@When("preencho a senha")
	public void preencho_a_senha() {
	   metodo.escrever(senha, "secret_sauce");
	}

	@When("clico no botao login")
	public void clico_no_botao_login() {
		metodo.clicar(BtnLogin);
	
	}
	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		
	
	}

}
