package com.UJC.bolsa.Service;

import java.util.List;

import com.UJC.bolsa.domain.Distrito;

public interface DestritoService {

	void salvar(Distrito destrito);

	void editar(Distrito destrito);

	void excluir(Long id);

	Distrito buscarPorId(Long id);

	List<Distrito> buscarTodos();
}
