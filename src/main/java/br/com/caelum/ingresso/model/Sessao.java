/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Classe Entidade Sessao
 * 
 * @author lab7079
 */
@Entity
public class Sessao {

	@Id
	@GeneratedValue
	private Integer id;

	private LocalTime horario;

	@ManyToOne
	private Filme filme;

	@ManyToOne
	private Sala sala;

	// deprecated HIbernate Only
	public Sessao() {
	}

	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		this.horario = horario;
		this.setFilme(filme);
		this.sala = sala;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param horario
	 *            the horario to set
	 */
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	/**
	 * @return the filme
	 */
	public Filme getFilme() {
		return filme;
	}

	/**
	 * @param filme
	 *            the filme to set
	 */
	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	/**
	 * @return the sala
	 */
	public Sala getSala() {
		return sala;
	}

	/**
	 * @param sala
	 *            the sala to set
	 */
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public LocalTime getHorarioTermino() {
		return this.horario.plus(filme.getDuracao().toMinutes(), ChronoUnit.MINUTES);
	}
}
