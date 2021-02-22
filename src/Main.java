import java.math.BigDecimal;

import br.com.desconto.CalculadoraDeDesconto;
import br.com.imposto.CalculadoraDeImpostos;
import br.com.imposto.ICMS;
import br.com.imposto.ISS;
import br.com.pedido.Pedido;

public class Main {
	
	public static void main(String[] args) {
		Pedido orcamento = new Pedido(new BigDecimal("100"), 6);
		
		CalculadoraDeImpostos calcImpostos = new CalculadoraDeImpostos();
		System.out.println("impostos: " + calcImpostos.calcular(orcamento, new ISS()));
		
		CalculadoraDeDesconto calcDesconto = new CalculadoraDeDesconto();
		System.out.println("desconto: " + calcDesconto.calcular(orcamento));
	}
}
