package decorater;

import java.util.Scanner;

import strategy.ISS;
import strategy.Imposto;
import strategy.Orcamento;

public class testeDeImpostosComplexos {

	public static void main(String[] args) {
		ImpostoDecorate ipva = new ImpostoIPVADecorate(new ImpostoLICDecorate());
		
		Scanner entrada = new Scanner(System.in);
		double val =0.0;
		
		System.out.println("Digite um valor");
		val = entrada.nextDouble();
		Orcamento orcamento = new Orcamento(val);
		
		double valor = ipva.calcula(orcamento);
		System.out.println("Imposto: " + valor);
		
	}
}
