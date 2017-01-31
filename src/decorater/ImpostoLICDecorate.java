package decorater;

import strategy.Orcamento;

public class ImpostoLICDecorate extends ImpostoDecorate{

	@Override
	double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
