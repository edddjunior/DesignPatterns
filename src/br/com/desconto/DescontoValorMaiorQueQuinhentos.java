package br.com.desconto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public class DescontoValorMaiorQueQuinhentos implements IDesconto {

	private IDesconto proximo;

	@Override
	public void setProximo(IDesconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getValor().compareTo(new BigDecimal("500")) > 0) {
			return pedido.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(pedido);
	}
}
