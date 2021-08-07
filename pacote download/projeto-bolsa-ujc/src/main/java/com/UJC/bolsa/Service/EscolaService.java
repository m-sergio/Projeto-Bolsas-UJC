package com.UJC.bolsa.Service;

import java.util.List;


import com.UJC.bolsa.domain.Escola;

public interface EscolaService {

	void salvar(Escola escola);

	void editar(Escola escola);

	void excluir(Long id);

	Escola buscarPorId(Long id);

	List<Escola> buscarTodos();
}
