package br.com.desconto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public class DescontoCupom implements IDesconto, ICupomDesconto {

	private IDesconto proximo;

	@Override
	public void setProximo(IDesconto proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public BigDecimal calcular(Pedido pedido) {
		BigDecimal desconto = verificarCupom(pedido);
		if (desconto.compareTo(BigDecimal.ZERO) != 0) {
			return desconto;
		}
		return proximo.calcular(pedido);
	}

	@Override
	public BigDecimal verificarCupom(Pedido pedido) {
		return BigDecimal.ZERO;
	}

}
