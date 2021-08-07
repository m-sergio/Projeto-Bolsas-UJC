package com.UJC.bolsa.Dao;

import java.util.List;

import com.UJC.bolsa.domain.Distrito;

public interface DestritoDao {

	void save(Distrito destrito);

	void update(Distrito destrito);

	void delete(Long id);

	Distrito findById(Long id);

	List<Distrito> findAll();
}
