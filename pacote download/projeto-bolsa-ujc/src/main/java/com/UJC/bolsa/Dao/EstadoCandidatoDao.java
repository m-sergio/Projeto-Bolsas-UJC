package com.UJC.bolsa.Dao;

import java.util.List;

import com.UJC.bolsa.domain.Estadocandidato;



public interface EstadoCandidatoDao {
	
	void save(Estadocandidato estado);

	void update(Estadocandidato estado);

	void delete(Long id);

	Estadocandidato findById(Long id);

	List<Estadocandidato> findAll();


}
