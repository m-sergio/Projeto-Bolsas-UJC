package com.UJC.bolsa.Service;

import java.util.List;

import com.UJC.bolsa.domain.Provincia;

public interface ProvinciaService {

	void salvar(Provincia provincia);

	void editar(Provincia provincia);

	void excluir(Long id);

	Provincia buscarPorId(Long id);

	List<Provincia> buscarTodos();
}
