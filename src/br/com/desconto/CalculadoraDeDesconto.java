package br.com.desconto;

import java.math.BigDecimal;

import br.com.pedido.Pedido;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Pedido orcamento) {
		IDesconto descontoMaisDeCincoItens = new DescontoMaisDeCincoItens();
		IDesconto descontoValorMaiorQueQuinhentos = new DescontoValorMaiorQueQuinhentos();
		IDesconto descontoCupom = new DescontoCupom();
		IDesconto semDesconto = new SemDesconto();
		
		descontoMaisDeCincoItens.setProximo(descontoValorMaiorQueQuinhentos);
		descontoValorMaiorQueQuinhentos.setProximo(descontoCupom);
		descontoCupom.setProximo(semDesconto);
		
		return descontoMaisDeCincoItens.calcular(orcamento);
	}
}
 