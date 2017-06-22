/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;

/**
 * @author Julivan Meridius
 * @since	22/06/2017 
 */
public class Ingresso {

	private Sessao sessao;
	private BigDecimal preco;
	
	public Ingresso(Sessao sessao, Desconto tipoDeDesconto) {
		this.sessao = sessao;
		this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
	}

	/**
	 * @return the sessao
	 */
	public Sessao getSessao() {
		return sessao;
	}

	/**
	 * @return the preco
	 */
	public BigDecimal getPreco() {
		return preco;
	}
}
