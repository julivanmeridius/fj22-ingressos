/**
 * 
 */
package br.com.caelum.ingresso.model;



import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Classe entidade do Ingresso.
 * @author 	Julivan Meridius
 * @since	22/06/2017 
 */
@Entity
public class Ingresso {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	private Sessao sessao;
	
	private BigDecimal preco;
	
	@ManyToOne
	private Lugar lugar;
	
	@Enumerated(EnumType.STRING)
	private TipoDeIngresso tipoDeIngresso;
	
	//-- Deprecated Hibernate only
	public Ingresso() {
		// TODO Auto-generated constructor stub
	}
	
	public Ingresso(Sessao sessao, TipoDeIngresso tipoDeDesconto, Lugar lugar) {
		this.sessao = sessao;
		this.tipoDeIngresso = tipoDeDesconto;
		this.preco = tipoDeDesconto.aplicaDesconto(sessao.getPreco());
		this.lugar = lugar;
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
	/**
	 * @return the lugar
	 */
	public Lugar getLugar() {
		return lugar;
	}
}
