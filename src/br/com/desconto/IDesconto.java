package br.com.desconto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public interface IDesconto {
	
	BigDecimal calcular(Pedido orcamento);
	void setProximo(IDesconto nextChain);
}
