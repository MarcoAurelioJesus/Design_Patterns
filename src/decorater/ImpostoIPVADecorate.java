package decorater;

import strategy.Orcamento;

public class ImpostoIPVADecorate extends ImpostoDecorate {

	
	public ImpostoIPVADecorate(){
		
	}
	
	public ImpostoIPVADecorate(ImpostoDecorate outroImposto){
		super(outroImposto);
	}
	
	@Override
	double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
	}

}
