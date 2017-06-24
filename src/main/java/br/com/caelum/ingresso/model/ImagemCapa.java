/**
 * 
 */
package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Classe de detalhe de Imagem da capa
 * @author Julivan Meridius
 * @since 23/06/2017
 */
public class ImagemCapa {

	@JsonProperty("Poster")
	String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
