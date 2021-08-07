package com.UJC.bolsa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UJC.bolsa.Dao.EstadoCandidatoDao;
import com.UJC.bolsa.domain.Estadocandidato;

@Service
@Transactional(readOnly = false)
public class EstadoCandidatoServiceImpl implements EstadoCandidadatoService {
	
	@Autowired
	private EstadoCandidatoDao dao;

	@Override
	public void salvar(Estadocandidato estado) {
		dao.save(estado);
		
	}

	@Override
	public void editar(Estadocandidato estado) {
		
		dao.update(estado);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Estadocandidato buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Estadocandidato> buscarTodos() {
		
		return dao.findAll();
	}

}
