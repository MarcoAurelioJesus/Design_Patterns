package strategy;

public class CalculadorDeImpostos {
	
	public double realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
			double valor = impostoQualquer.calcula(orcamento);
			return valor;

	}
}
