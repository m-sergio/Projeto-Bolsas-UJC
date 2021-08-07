package com.UJC.bolsa.Dao;

import java.util.List;

import com.UJC.bolsa.domain.Escola;



public interface EscolaDao {
	void save(Escola escola);

	void update(Escola escola);

	void delete(Long id);

	Escola findById(Long id);

	List<Escola> findAll();

}
