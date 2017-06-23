/**
 * 
 */
package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Classe de Detalhes do Filme
 * @author Julivan Meridius
 * @since 22/06/2017
 */
public class DetalhesDoFilme {

	@JsonProperty("Title")
	private String titulo;

	@JsonProperty("Year")
	private Integer ano;
	
	@JsonProperty("Poster")
	private String imagem;
	
	@JsonProperty("Director")
	private String diretores;
	
	@JsonProperty("Writer")
	private String escritores;
	
	@JsonProperty("Actors")
	private String atores;
	
	@JsonProperty("Plot")
	private String descricao;
	
	@JsonProperty("imdbRating")
	private Double avaliacao;
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the ano
	 */
	public Integer getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	/**
	 * @return the imagem
	 */
	public String getImagem() {
		return imagem;
	}
	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	/**
	 * @return the diretores
	 */
	public String getDiretores() {
		return diretores;
	}
	/**
	 * @param diretores the diretores to set
	 */
	public void setDiretores(String diretores) {
		this.diretores = diretores;
	}
	/**
	 * @return the escritores
	 */
	public String getEscritores() {
		return escritores;
	}
	/**
	 * @param escritores the escritores to set
	 */
	public void setEscritores(String escritores) {
		this.escritores = escritores;
	}
	/**
	 * @return the atores
	 */
	public String getAtores() {
		return atores;
	}
	/**
	 * @param atores the atores to set
	 */
	public void setAtores(String atores) {
		this.atores = atores;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the avaliacao
	 */
	public Double getAvaliacao() {
		return avaliacao;
	}
	/**
	 * @param avaliacao the avaliacao to set
	 */
	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}
}
