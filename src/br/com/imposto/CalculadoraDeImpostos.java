package br.com.imposto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Pedido orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
