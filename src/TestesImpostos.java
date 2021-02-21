import java.math.BigDecimal;

import br.com.imposto.CalculadoraDeImpostos;
import br.com.imposto.ICMS;
import br.com.orcamento.Orcamento;
import desconto.CalculadoraDeDesconto;

public class TestesImpostos {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		
		CalculadoraDeImpostos calcImpostos = new CalculadoraDeImpostos();
		System.out.println(calcImpostos.calcular(orcamento, new ICMS()));
		
		CalculadoraDeDesconto calcDesconto = new CalculadoraDeDesconto();
		System.out.println(calcDesconto.calcular(orcamento));

	}
}
