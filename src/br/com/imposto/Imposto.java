package br.com.imposto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public interface Imposto {

	BigDecimal calcular(Pedido orcamento);
}
