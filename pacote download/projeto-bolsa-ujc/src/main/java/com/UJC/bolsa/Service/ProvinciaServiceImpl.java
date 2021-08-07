package com.UJC.bolsa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UJC.bolsa.Dao.ProvinciaDao;
import com.UJC.bolsa.domain.Provincia;
@Service
@Transactional(readOnly = false)
public class ProvinciaServiceImpl implements ProvinciaService{

	@Autowired
	private ProvinciaDao dao;
	
	
	@Override
	public void salvar(Provincia provincia) {
		dao.save(provincia);
		
	}

	@Override
	public void editar(Provincia provincia) {
		dao.update(provincia);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Provincia buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Provincia> buscarTodos() {
		
		return dao.findAll();
	}

}
