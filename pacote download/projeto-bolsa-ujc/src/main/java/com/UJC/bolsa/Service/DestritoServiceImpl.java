package com.UJC.bolsa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UJC.bolsa.Dao.DestritoDao;
import com.UJC.bolsa.domain.Distrito;

@Service
@Transactional(readOnly = false)
public class DestritoServiceImpl implements DestritoService {

	@Autowired
	private DestritoDao dao;

	@Override
	public void salvar(Distrito destrito) {
		dao.save(destrito);

	}

	@Override
	public void editar(Distrito destrito) {
		dao.update(destrito);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Distrito buscarPorId(Long id) {

		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Distrito> buscarTodos() {

		return dao.findAll();
	}

}
