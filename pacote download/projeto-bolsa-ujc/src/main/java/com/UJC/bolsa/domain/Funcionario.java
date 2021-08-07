package com.UJC.bolsa.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity<Long> {

	// Atributos
	@Column(nullable = false, unique = true, length = 60)
	private String nome;

	@Column(nullable = false, unique = true, length = 30)
	private String apelido;

	// Metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

}
