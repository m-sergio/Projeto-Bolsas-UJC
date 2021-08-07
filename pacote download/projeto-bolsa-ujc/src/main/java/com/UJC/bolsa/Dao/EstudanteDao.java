package com.UJC.bolsa.Dao;

import java.util.List;

import com.UJC.bolsa.domain.Estudante;

public interface EstudanteDao {
	
	void save(Estudante estudante);

	void update(Estudante estudante);

	void delete(Long id);

	Estudante findById(Long id);

	List<Estudante> findAll();

}
