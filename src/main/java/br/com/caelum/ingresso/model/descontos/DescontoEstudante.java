/**
 * 
 */
package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

/**
 * @author lab7079
 *
 */
public class DescontoEstudante implements Desconto {

	private BigDecimal metade = new BigDecimal("2.0");
	
	/* (non-Javadoc)
	 * @see br.com.caelum.ingresso.model.descontos.Desconto#aplicarDescontoSobre(java.math.BigDecimal)
	 */
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(metade);
	}

	@Override
	public String getDescricao() {
		return "Estudante";
	}
}
