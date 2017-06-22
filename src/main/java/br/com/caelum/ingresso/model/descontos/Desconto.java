package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

/**
 * Interface de Desconto para os posteriores calculos.
 * @author Julivan Meridius
 */
public interface Desconto {
	BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal);
}
