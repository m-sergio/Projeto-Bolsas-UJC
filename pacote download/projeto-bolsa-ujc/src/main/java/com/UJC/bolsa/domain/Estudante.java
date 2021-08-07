package com.UJC.bolsa.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@SuppressWarnings("serial")
@Entity
@Table(name = "estudantes")
public class Estudante extends AbstractEntity<Long> {


	
	@Size(min=4, max=5)
	@Column(nullable = false, unique = true)
	private String codigoEstudante;
	

	@Column(nullable = false, unique = true)
	private String nome_apelido;

	@Column( nullable = false, columnDefinition = "DATE")
	private LocalDate dataNascimento;
	
	@ManyToOne
	@JoinColumn(name = "provinciaNascimento_id_fk")
	private Provincia provincia;
	
	@ManyToOne
	@JoinColumn(name = "distritoNascimento_id_fk")
	private Distrito distritoResidencia;
	
	@Column(name="anoFrequencia",nullable = false,  length =  1)
	private Integer anoFrequencia;
	
	@Column(nullable = false, unique = true, length =5)
	private Integer nrCelular;
	
	@Column(nullable = false, unique = true, length =5)
	private Integer nrCelularAlter;

	@Column(nullable = false, length = 4)
	private String curso;

	@Column(nullable = false, length = 10 )
	private String genero;
	
	
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_usuario")
	private User user;
	
	@Column(nullable = false, length =100)
	private String estado;
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Distrito getDistritoResidencia() {
		return distritoResidencia;
	}

	public void setDistritoResidencia(Distrito distritoResidencia) {
		this.distritoResidencia = distritoResidencia;
	}



	public Integer getNrCelular() {
		return nrCelular;
	}

	public void setNrCelular(Integer nrCelular) {
		this.nrCelular = nrCelular;
	}

	public Integer getNrCelularAlter() {
		return nrCelularAlter;
	}

	public String getCodigoEstudante() {
		return codigoEstudante;
	}

	public void setCodigoEstudante(String codigoEstudante) {
		this.codigoEstudante = codigoEstudante;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setNrCelularAlter(Integer nrCelularAlter) {
		this.nrCelularAlter = nrCelularAlter;
	}



	public String getNome_apelido() {
		return nome_apelido;
	}

	public void setNome_apelido(String nome_apelido) {
		this.nome_apelido = nome_apelido;
	}

	public Integer getAnoFrequencia() {
		return anoFrequencia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAnoFrequencia(Integer anoFrequencia) {
		this.anoFrequencia = anoFrequencia;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	

	
	
	

	
	
	
}
