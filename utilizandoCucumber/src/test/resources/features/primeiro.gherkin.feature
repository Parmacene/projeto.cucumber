Feature: Login
	Como usuario da aplicacao
	Quero realizar o login
	Para acessar a minha conta
	
	Background: Acessar tela de login
		Given que nao esteja logado
	
	Scenario: Login com sucesso
		When preencho o usuario
		And preencho a senha
		And clico no botao login
		Then Login realizado com sucesso
		
	Scenario: Login com senha invalida
		When preencho o usuario
		And preencho a senha invalida
		And clico no botao login
		Then valido mensagem de senha invalida
		
	Scenario: Login com usuario invalido
		When preencho o usuario invalido
		And preencho a senha
		And clico no botao login
		Then valido mensagem de usuario invalido
		
	Scenario: Login com dados em branco
		But nao preencho o usuario
		And nao preencho a senha
		When clico no botao login
		Then valido mensagem de usuario e senha em branco
