package br.com.caelum.ingresso.validacao;

/**
 * 
 * 
 */

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import br.com.caelum.ingresso.model.Sessao;

/**
 * Gerenciador de Sessao
 * 
 * @author Julivan Meridius
 * @since 21/06/2017
 */
public class GerenciadorDeSessao {

	private List<Sessao> sessoesDaSala;

	public GerenciadorDeSessao(List<Sessao> sessoesDaSala) {
		this.sessoesDaSala = sessoesDaSala;
	}

	public boolean cabe(Sessao sessaoAtual) {

		Optional<Boolean> optionalCabe = sessoesDaSala.stream()
				.map(sessaoExistente -> horarioIsValid(sessaoExistente, sessaoAtual)).reduce(Boolean::logicalAnd);
		return optionalCabe.orElse(true);
	}

	private boolean horarioIsValid(Sessao sessaoExistente, Sessao sessaoAtual) {

		LocalTime horarioSessao = sessaoExistente.getHorario();
		LocalTime horarioAtual = sessaoAtual.getHorario();

		boolean ehAntes = horarioAtual.isBefore(horarioSessao);

		if (ehAntes) {

			return horarioAtual.plusMinutes(sessaoAtual.getFilme().getDuracao().toMinutes())
					.isBefore(sessaoExistente.getHorario());

		} else {

			return sessaoExistente.getHorarioTermino().isBefore(horarioAtual);
		}
	}
}
