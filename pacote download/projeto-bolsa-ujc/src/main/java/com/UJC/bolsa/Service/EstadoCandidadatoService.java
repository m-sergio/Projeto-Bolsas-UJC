package com.UJC.bolsa.Service;

import java.util.List;


import com.UJC.bolsa.domain.Estadocandidato;

public interface EstadoCandidadatoService {
	
	void salvar(Estadocandidato estado);

	void editar(Estadocandidato estado);

	void excluir(Long id);

	Estadocandidato buscarPorId(Long id);

	List<Estadocandidato> buscarTodos();

}
