package desconto;

import java.math.BigDecimal;

import br.com.orcamento.Orcamento;

public class DescontoValorMaiorQueQuinhentos implements Desconto {

	private Desconto proximo;

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(orcamento);
	}
}
