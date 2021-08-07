package com.UJC.bolsa.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "provincias")
public class Provincia extends AbstractEntity<Long> {

	@Column(name = "designacao", nullable = false, unique = true, length = 60)
	private String designacao;

	@OneToMany(mappedBy = "provincia")
	private List<Distrito> distrito;
	
	@OneToMany(mappedBy = "provincia")
	private List<Estudante> estudante;
	
	@OneToMany(mappedBy = "provincia")
	private List<Escola> escola;

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public List<Distrito> getDistrito() {
		return distrito;
	}

	public void setDistrito(List<Distrito> distrito) {
		this.distrito = distrito;
	}

	public List<Escola> getEscola() {
		return escola;
	}

	public void setEscola(List<Escola> escola) {
		this.escola = escola;
	}

	public List<Distrito> getDestrito() {
		return distrito;
	}

	public void setDestrito(List<Distrito> distrito) {
		this.distrito = distrito;
	}

	public List<Estudante> getEstudante() {
		return estudante;
	}

	public void setEstudante(List<Estudante> estudante) {
		this.estudante = estudante;
	}

	
}
