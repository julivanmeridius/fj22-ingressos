/**
 * 
 */
package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

/**
 * @author lab7079
 *
 */
public class DescontoTrintaPorcentoParaBancos implements Desconto {
	
	private BigDecimal percentualDesconto = new BigDecimal("0.3");
	
	/* (non-Javadoc)
	 * @see br.com.caelum.ingresso.model.descontos.Desconto#aplicarDescontoSobre(java.math.BigDecimal)
	 */
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.subtract(trintaPorcentoSobre(precoOriginal));
	}

	private BigDecimal trintaPorcentoSobre(BigDecimal precoOriginal) {
		return precoOriginal.multiply(percentualDesconto);
	}
}
