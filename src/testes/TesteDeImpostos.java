package testes;

import java.util.Scanner;

import ChainOfResponsability.Item;
import strategy.CalculadorDeImpostos;
import strategy.ICMS;
import strategy.IRPF;
import strategy.ISS;
import strategy.Imposto;
import strategy.Orcamento;
import templateMethod.ImpostoICPP;
import templateMethod.ImpostoIKCV;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorOrcado =0.0;
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto irpf = new IRPF();
		Imposto ikcv = new ImpostoIKCV();
		Imposto icpp =  new ImpostoICPP();
		System.out.println("Digite um valor");
		valorOrcado = entrada.nextInt();
		Orcamento orcamento = new Orcamento(valorOrcado);
	
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		System.out.println("ICMS: " + calculador.realizaCalculo(orcamento, icms));	
		System.out.println("ISS: " + calculador.realizaCalculo(orcamento, iss));
		System.out.println("IRPF: " + calculador.realizaCalculo(orcamento, irpf));
		System.out.println("ImpostoIKCV: " + calculador.realizaCalculo(orcamento, ikcv));
		System.out.println("ImpostoICPP: "+calculador.realizaCalculo(orcamento, icpp));
	}
}
