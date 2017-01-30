package strategy;

import java.util.Scanner;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorOrcado =0.0;
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto irpf = new IRPF();
		System.out.println("Digite um valor");
		valorOrcado = entrada.nextInt();
		Orcamento orcamento = new Orcamento(valorOrcado);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		System.out.println("ICMS: " + calculador.realizaCalculo(orcamento, icms));	
		System.out.println("ISS: " + calculador.realizaCalculo(orcamento, iss));
		System.out.println(calculador.realizaCalculo(orcamento, irpf));

	}
}
