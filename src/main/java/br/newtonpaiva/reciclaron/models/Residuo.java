package br.newtonpaiva.reciclaron.models;

import java.math.BigDecimal;

/**
 * 
 * @author kevin
 *
 */
public class Residuo {
	private TipoResiduo tipoResiduo;
	private double quantidadeResiduo;
	private BigDecimal valorResiduo;
	private boolean ativoResiduo;

	public TipoResiduo getTipoResiduo() {
		return tipoResiduo;
	}

	public void setTipoResiduo(TipoResiduo tipoResiduo) {
		this.tipoResiduo = tipoResiduo;
	}

	public double getQuantidadeResiduo() {
		return quantidadeResiduo;
	}

	public void setQuantidadeResiduo(double quantidadeResiduo) {
		this.quantidadeResiduo = quantidadeResiduo;
	}

	public BigDecimal getValorResiduo() {
		return valorResiduo;
	}

	public void setValorResiduo(BigDecimal valorResiduo) {
		this.valorResiduo = valorResiduo;
	}

	public boolean isAtivoResiduo() {
		return ativoResiduo;
	}

	public void setAtivoResiduo(boolean ativoResiduo) {
		this.ativoResiduo = ativoResiduo;
	}

	/**
	 * Cadastra resíduo
	 */
	public void cadastrarResiduo() {
		throw new UnsupportedOperationException();
	}
}
