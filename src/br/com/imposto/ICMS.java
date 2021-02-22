package br.com.imposto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public class ICMS implements Imposto {

	public BigDecimal calcular(Pedido orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
