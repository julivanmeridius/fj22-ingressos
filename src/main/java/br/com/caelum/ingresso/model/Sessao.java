/**
 * 
 */
package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Classe Entidade Sessao
 * 
 * @author Julivan Meridius
 * @since 22/06/2017
 */
@Entity
public class Sessao {

	@Id
	@GeneratedValue
	private Integer id;
	private LocalTime horario;

	@ManyToOne
	private Filme filme;

	@OneToMany(mappedBy = "sessao", fetch = FetchType.EAGER)
	private Set<Ingresso> ingressos = new HashSet<>();

	/**
	 * @param ingressos the ingressos to set
	 */
	public void setIngressos(Set<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

	@ManyToOne
	private Sala sala;

	private BigDecimal preco;

	/**
	 * @return the preco
	 */
	public BigDecimal getPreco() {
		return preco;
	}

	/**
	 * @param preco
	 *            the preco to set
	 */
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	// deprecated HIbernate Only
	public Sessao() {
	}

	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		this.horario = horario;
		this.setFilme(filme);
		this.sala = sala;
		this.preco = sala.getPreco().add(filme.getPreco());
	}

	public Map<String, List<Lugar>> getMapaDeLugares() {
		return sala.getMapaDeLugares();
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

	// -- Metodo auxiliar para verificar se o assento esta disponivel para
	// compra
	public boolean isDisponivel(Lugar lugar) {
		return ingressos.stream().map(Ingresso::getLugar).noneMatch(l -> l.equals(lugar));
	}

	/**
	 * @return the ingressos
	 */
	public Set<Ingresso> getIngressos() {
		return ingressos;
	}
}
