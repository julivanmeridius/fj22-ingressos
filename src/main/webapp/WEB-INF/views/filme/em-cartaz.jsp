<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="ingresso"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<ingresso:template>
	<jsp:body>
		<div class=" col-md-6 col-md-offset-3">
			<c:forEach var="filme" items="${filmes}">
				<div class="col-md-4">
					<a href="/filme/${filme.id}/detalhe">
						<div class="panel panel-default panelSize">
							<div class="panel-heading text-center">
								<strong>${filme.nome}</strong>
							</div>
							<div class="panel-body">
								<div>
									<strong>Gênero:</strong>${filme.genero}
								</div>
								<div>
									<strong>Duração:</strong>${filme.duracao.toMinutes()}Minutos
								</div>
							</div>
						</div>
					</a>				
				</div>
			</c:forEach>
		</div>
		<style>
			a:hover {
				text-decoration: none;
			}
			
			.panel {
				transition: transform 0.7s;
			}
			
			.panel:hover {
				transform: translateY(-0.5em)
			}
			
			.panelSize {
				min-height: 10.5em;
				mini-width: 13em;
			}
			</style>
    </jsp:body>
</ingresso:template>
