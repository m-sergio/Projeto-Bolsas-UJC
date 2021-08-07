package com.UJC.bolsa.Service;

import java.util.List;

import com.UJC.bolsa.domain.Estudante;


public interface EstudanteService {

	void salvar(Estudante estudante);

	void editar(Estudante estudante);

	void excluir(Long id);

	Estudante buscarPorId(Long id);

	List<Estudante> buscarTodos();

}
