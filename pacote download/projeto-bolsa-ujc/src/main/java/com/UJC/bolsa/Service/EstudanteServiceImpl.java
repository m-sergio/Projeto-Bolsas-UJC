package com.UJC.bolsa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UJC.bolsa.Dao.EstudanteDao;
import com.UJC.bolsa.domain.Estudante;

@Service
@Transactional(readOnly = false)
public class EstudanteServiceImpl implements EstudanteService {
	
	@Autowired
	private EstudanteDao dao;

	@Override
	public void salvar(Estudante estudante) {
		dao.save(estudante);
		
	}

	@Override
	public void editar(Estudante estudante) {
		dao.update(estudante);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Estudante buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Estudante> buscarTodos() {
		
		return dao.findAll();
	}

}
