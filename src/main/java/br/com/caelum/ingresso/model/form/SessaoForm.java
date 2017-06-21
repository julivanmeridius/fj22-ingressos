/**
 * 
 */
package br.com.caelum.ingresso.model.form;

import java.time.LocalTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

/**
 * Classe DTO para objetos Sessao
 * @author Julivan Meridius
 */
public class SessaoForm {

	/**
	 * @return the salaId
	 */
	public Integer getSalaId() {
		return salaId;
	}

	/**
	 * @param salaId the salaId to set
	 */
	public void setSalaId(Integer salaId) {
		this.salaId = salaId;
	}

	private Integer id;
	
	@NotNull
	private Integer salaId;
	
	@DateTimeFormat(pattern="HH:mm")
	@NotNull
	private LocalTime horario;
	
	@NotNull
	private Integer filmeId;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the horario
	 */
	public LocalTime getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	/**
	 * @return the filmeId
	 */
	public Integer getFilmeId() {
		return filmeId;
	}

	/**
	 * @param filmeId the filmeId to set
	 */
	public void setFilmeId(Integer filmeId) {
		this.filmeId = filmeId;
	}

	public Sessao toSessao(SalaDao salaDao, FilmeDao filmeDao) {
		
		Filme filme = filmeDao.findOne(filmeId);
		Sala sala = salaDao.findOne(salaId);
		
		Sessao sessao = new Sessao(horario, filme, sala);
		sessao.setId(id);
		
		return sessao;
	}
}
