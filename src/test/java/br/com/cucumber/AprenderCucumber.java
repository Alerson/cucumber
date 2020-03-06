package br.com.cucumber;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AprenderCucumber {

	private int contador = 0;
	Date date = new Date();

	@Given("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
	}

	@When("^executa-lo$")
	public void executaLo() throws Throwable {
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
	}

	@Given("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@When("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador += arg1;
	}

	@Then("^entao o valor do contador sera (\\d+)$")
	public void entaoOValorDoContadorSera(int arg1) throws Throwable {
		//Assert.assertTrue(contador == arg1);
		Assert.assertEquals(arg1, contador);
	}

	@Given("^que o prazo e dia (\\d+)/(\\d+)/(\\d+)$")
	public void queOPrazoEDia(int arg1, int arg2, int arg3) throws Throwable {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, arg1);
		calendar.set(Calendar.MONTH, arg2 - 1); // A Classe Calendar o primeiro mes do ano como sendo 0 
		calendar.set(Calendar.YEAR, arg3);
		date = calendar.getTime();
	}

	@When("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		if ("dias".equalsIgnoreCase(tempo)) {
			calendar.add(Calendar.DAY_OF_MONTH, arg1);
		} else if ("meses".equalsIgnoreCase(tempo)) {
			calendar.add(Calendar.MONTH, arg1);
		}
		date = calendar.getTime();
	}

	@Then("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String arg1) throws Throwable {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String data = dateFormat.format(date);
		System.out.println(arg1 + " <-> " + data);
		Assert.assertEquals(arg1, data);
	}

}
