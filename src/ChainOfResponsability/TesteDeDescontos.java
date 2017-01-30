package ChainOfResponsability;

import java.util.Scanner;

import strategy.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorDesconto =0.0;
CalculadorDeDescontos decontos = new CalculadorDeDescontos();


System.out.println("Digite um valor");
valorDesconto = entrada.nextInt();
Orcamento orcamento = new Orcamento(valorDesconto);
orcamento.adicionaItem(new Item("X", valorDesconto));
orcamento.adicionaItem(new Item("X", valorDesconto));
orcamento.adicionaItem(new Item("X", valorDesconto));
orcamento.adicionaItem(new Item("X", valorDesconto));
orcamento.adicionaItem(new Item("X", valorDesconto));
orcamento.adicionaItem(new Item("X", valorDesconto));

double descontoFinal = decontos.calcula(orcamento);

System.out.println("Valor do desconto: " + descontoFinal);
	}

}
