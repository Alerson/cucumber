package br.com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*
		   dryRun = true,

		   Este atributo deve ser colocado para realizar 
		   para verificar se a estrutura do cucumber esta correta.
		   Uma vez executado ele apenas irá mostrar se o mapeamento do Cucumber está correto e,
		   irá pular todos os testes
		*/
		monochrome = true,
		features = "classpath:aprender_cucumber.feature",
		snippets = SnippetType.CAMELCASE,
		strict = true,
		plugin = "pretty")
public class Runner {

}
