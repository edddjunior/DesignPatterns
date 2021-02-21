package desconto;

import java.math.BigDecimal;

import br.com.orcamento.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public void setProximo(Desconto proximo) {
	}
	
	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
}
