package com.UJC.bolsa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UJC.bolsa.Dao.EscolaDao;
import com.UJC.bolsa.domain.Escola;
@Service
@Transactional(readOnly = false)
public class EscolaServiceImpl implements EscolaService {
	
	@Autowired
	private EscolaDao dao;

	@Override
	public void salvar(Escola escola) {
		dao.save(escola);
		
	}

	@Override
	public void editar(Escola escola) {
		dao.update(escola);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Escola buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Escola> buscarTodos() {
		
		return dao.findAll();
	}

}
