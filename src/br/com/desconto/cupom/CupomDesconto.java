package br.com.desconto.cupom;

import java.util.Date;

public class CupomDesconto {

	private String cupomCod;
	private Date dataExpiracao;
	
	public CupomDesconto(String cupomCod, Date dataExpiracao) {
		super();
		this.cupomCod = cupomCod;
		this.dataExpiracao = dataExpiracao;
	}
	
	public String getCupomCod() {
		return cupomCod;
	}
	public void setCupomCod(String cupomCod) {
		this.cupomCod = cupomCod;
	}
	public Date getDataExpiracao() {
		return dataExpiracao;
	}
	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}
}
