package desconto;

import java.math.BigDecimal;
import br.com.orcamento.Orcamento;

public interface Desconto {
	
	BigDecimal calcular(Orcamento orcamento);
	void setProximo(Desconto nextChain);
}
