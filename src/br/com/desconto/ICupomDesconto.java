package br.com.desconto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public interface ICupomDesconto {

	BigDecimal verificarCupom(Pedido pedido);
}
