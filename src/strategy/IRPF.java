package strategy;

public class IRPF implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {

	return (orcamento.getValor() <= 1000.0) ? orcamento.getValor() * 0.15 : (orcamento.getValor()* 0.27);
}
}