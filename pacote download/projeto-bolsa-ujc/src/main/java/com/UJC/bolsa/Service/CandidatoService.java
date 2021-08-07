package com.UJC.bolsa.Service;

import java.util.List;

import com.UJC.bolsa.domain.Candidato;

public interface CandidatoService {

	void salvar(Candidato candidato);

	void editar(Candidato candidato);

	void excluir(Long id);

	Candidato buscarPorId(Long id);

	List<Candidato> buscarTodos();
	
	String generateReport();
}
