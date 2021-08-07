package com.UJC.bolsa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "escolas")
public class Escola extends AbstractEntity<Long> {

	@Column(nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "provincia_id_fk")
	private Provincia provincia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	
	
	
}
