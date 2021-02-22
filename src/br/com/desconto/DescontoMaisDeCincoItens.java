package br.com.desconto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public class DescontoMaisDeCincoItens implements IDesconto {
	
	private IDesconto proximo;

	@Override
	public void setProximo(IDesconto proximo) {
		this.proximo = proximo;		
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getQuantidadeItens() > 5) {
			return pedido.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(pedido);
	}

}
