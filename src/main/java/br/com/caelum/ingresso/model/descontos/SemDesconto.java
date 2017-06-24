/**
 * 
 */
package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

/**
 * Implementacao da classe Sem Nenhum Tipo de Desconto.
 * @author  Julivan Meridius
 * @since	23/06/2017
 */
public class SemDesconto implements Desconto {

	/* (non-Javadoc)
	 * @see br.com.caelum.ingresso.model.descontos.Desconto#aplicarDescontoSobre(java.math.BigDecimal)
	 */
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal;
	}

	@Override
	public String getDescricao() {
		return "Normal";
	}
}
