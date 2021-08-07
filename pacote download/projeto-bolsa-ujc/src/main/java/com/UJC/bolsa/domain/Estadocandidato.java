package com.UJC.bolsa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tab_estados")
public class Estadocandidato extends AbstractEntity<Long> {
	
	@Column(nullable = false, length = 70)
	private String situacao;

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	
}
