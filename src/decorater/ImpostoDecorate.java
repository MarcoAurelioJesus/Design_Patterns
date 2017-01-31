package decorater;

import strategy.Orcamento;

public abstract class ImpostoDecorate {

	protected ImpostoDecorate outroImposto;

	public ImpostoDecorate(ImpostoDecorate outroImposto) {
		this.outroImposto = outroImposto;
	}

	public ImpostoDecorate() {
	}

	abstract double calcula(Orcamento orcamento);

	protected double calculaOutroImposto(Orcamento orcamento) {

		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}
}