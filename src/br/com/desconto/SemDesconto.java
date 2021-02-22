package br.com.desconto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public class SemDesconto implements IDesconto{

	@Override
	public void setProximo(IDesconto proximo) {
	}
	
	@Override
	public BigDecimal calcular(Pedido orcamento) {
		return BigDecimal.ZERO;
	}
}
