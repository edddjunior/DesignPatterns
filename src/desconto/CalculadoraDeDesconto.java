package desconto;

import java.math.BigDecimal;

import br.com.orcamento.Orcamento;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto descontoMaisDeCincoItens = new DescontoMaisDeCincoItens();
		Desconto descontoValorMaiorQueQuinhentos = new DescontoValorMaiorQueQuinhentos();
		Desconto semDesconto = new SemDesconto();
		
		descontoMaisDeCincoItens.setProximo(descontoValorMaiorQueQuinhentos);
		descontoValorMaiorQueQuinhentos.setProximo(semDesconto);
		
		return descontoMaisDeCincoItens.calcular(orcamento);
	}

}
 