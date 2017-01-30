package ChainOfResponsability;

import strategy.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
    
  }
