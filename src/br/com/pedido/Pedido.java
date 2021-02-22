package br.com.pedido;

import java.math.BigDecimal;

public class Pedido {

	private BigDecimal valor;
	private int quantidadeItens;
	private String cupomDescontoCod;

	public Pedido(BigDecimal valor, int quantidadeItens) {
		super();
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;

	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	public String getCupomDescontoCod() {
		return cupomDescontoCod;
	}
	
	public void setCupomDescontoCod(String cupomDescontoCod) {
		this.cupomDescontoCod = cupomDescontoCod;
	}
}
