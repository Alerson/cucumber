Feature: Aprender Cucumber
	Como um aluno
	Eu quero aprender utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação

Scenario: Deve executar especificação
	Given que criei o arquivo corretamente
	When executa-lo
	Then a especificação deve finalizar com sucesso

Scenario: Deve incrementar contador
	Given que o valor do contador é 15
	When eu incrementar em 3
	Then entao o valor do contador sera 18

Scenario: Deve calcular atraso no prazo de entrega
	Given que o prazo e dia 05/04/2018
	When a entrega atrasar em 2 dias
	Then a entrega sera efetuada em 07/04/2018

Scenario: Deve calcular atraso no prazo de entrega da China
	Given que o prazo e dia 05/04/2018
	When a entrega atrasar em 2 meses
	Then a entrega sera efetuada em 05/06/2018

Scenario: Deve criar steps genericos para estes passos

Scenario: Deve reaproveitar os steps "Given" do cenario anterior

Scenario: Deve negar todos os steps "Given" dos cenarios anteriores	