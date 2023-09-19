#author: email@dominio.com.br
Feature: Login com schema de scenarios
  Como usuario da aplicacao
  Quero realizar o login na minha conta
  Para acessar os meus dados

  Scenario Outline: Validando login
    Given que desejo realizar o login na aplicacao
    When informar o <usuario>
    And informar a <senha>
    And e clicar no botao login
    Then valido o <resultado> de acordo com dados de login

    Examples: 
      | usuario           | senha          | resultado                                                                   |
      | "standard_user"   | "secret_sauce" | "Swag labs"                                                                 |
      | "errado"          | "secret_sauce" | "Epic sadface: Username and password do not match any user in this service" |
      | ""                | ""             | "Epic sadface: Username is required"                                        |
      | "problem_user"    | "secret_sauce" | "mensagem de erro"                                                          |
      | "locked_out_user" | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out."                       |
