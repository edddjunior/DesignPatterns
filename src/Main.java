import java.math.BigDecimal;

import br.com.imposto.CalculadoraDeImpostos;
import br.com.imposto.ISS;
import br.com.orcamento.Orcamento;
import desconto.CalculadoraDeDesconto;

public class Main {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 1);
		
		CalculadoraDeImpostos calcImpostos = new CalculadoraDeImpostos();
		System.out.println("impostos: " + calcImpostos.calcular(orcamento, new ISS()));
		
		CalculadoraDeDesconto calcDesconto = new CalculadoraDeDesconto();
		System.out.println("desconto: " + calcDesconto.calcular(orcamento));
	}
}
