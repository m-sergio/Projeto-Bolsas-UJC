package com.UJC.bolsa.Dao.CandidatoDao;

import java.util.List;

import com.UJC.bolsa.domain.Candidato;


public interface CandidatoDao {


	void save(Candidato candidato);
	
	void update(Candidato candidato);

	void delete(Long id);
	
	Candidato findById(Long id);
	
	List<Candidato> findAll();
}
