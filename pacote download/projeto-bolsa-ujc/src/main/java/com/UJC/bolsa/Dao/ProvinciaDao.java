package com.UJC.bolsa.Dao;

import java.util.List;

import com.UJC.bolsa.domain.Provincia;

public interface ProvinciaDao {

	void save(Provincia provincia);

	void update(Provincia provincia);

	void delete(Long id);

	Provincia findById(Long id);

	List<Provincia> findAll();
}
