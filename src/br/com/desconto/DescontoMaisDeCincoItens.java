package desconto;

import java.math.BigDecimal;

import br.com.orcamento.Orcamento;

public class DescontoMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;		
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}

}
