package com.UJC.bolsa.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.format.annotation.DateTimeFormat.ISO;




@SuppressWarnings("serial")
@Entity
@Table(name = "candidatos")
public class Candidato extends AbstractEntity<Long> {

	
	
	//Atributos  
	@OneToOne
	@JoinColumn(name = "estudante_id_fk")
	private Estudante estudante;
	
	//Atributos pai
	@Column(name = "nome_Pai", nullable = false)
	private String nomePai;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_Nascimento_Pai", nullable = false, columnDefinition = "DATE")
	private LocalDate dataNascimentoPai;

	@Column(name = "profissao_Pai", nullable = false)
	private String profissaoPai;

	@Column(name = "entidade_Patronal_Pai", nullable = false)
	private String entidadePatronalPai;
	
	
	@Column(name = "contacto_Patronal_Pai", nullable = false)
	private int contactoPatronalPai;	
	
	//Atributos Mae
	@Column(name = "nomeMae", nullable = false)
	private String nomeMae;

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_Nascimento_Mae", nullable = false, columnDefinition = "DATE")
	private LocalDate dataNascimentoMae;

	@Column(name = "profissao_Mae", nullable = false)
	private String profissaoMae;

	@Column(name = "entidade_Patronal_Mae", nullable = false)
	private String entidadePatronalMae;

	
	@Column(name = "contacto_Patronal_Mae", nullable = false)
	private int contactoPatronalMae;
	
	@Column(name = "tipo_bolsa", nullable = false)
	private String tipoBolsa;
	
	@Column(name = "provincia_frequencia", nullable = false)
	private String provinciaFrequencia;
	
	@Column(name = "escola_frequencia", nullable = false)
	private String escolaFrequencia;
	
	@Column(name = "ano_conclusaoSecundario", nullable = false)
	private String anoConclusao;
	
	@Column(nullable = false)
	private String estado;
	
	
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@OneToMany(mappedBy ="candidato")
	private List<Documento> doc;
	
	
	
	
    //Metodos get e set
	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public LocalDate getDataNascimentoPai() {
		return dataNascimentoPai;
	}

	public void setDataNascimentoPai(LocalDate dataNascimentoPai) {
		this.dataNascimentoPai = dataNascimentoPai;
	}

	public String getEntidadePatronalPai() {
		return entidadePatronalPai;
	}

	public void setEntidadePatronalPai(String entidadePatronalPai) {
		this.entidadePatronalPai = entidadePatronalPai;
	}

	public Integer getContactoPatronalPai() {
		return contactoPatronalPai;
	}

	public void setContactoPatronalPai(Integer contactoPatronalPai) {
		this.contactoPatronalPai = contactoPatronalPai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public LocalDate getDataNascimentoMae() {
		return dataNascimentoMae;
	}

	public void setDataNascimentoMae(LocalDate dataNascimentoMae) {
		this.dataNascimentoMae = dataNascimentoMae;
	}


	public String getProfissaoPai() {
		return profissaoPai;
	}

	public void setProfissaoPai(String profissaoPai) {
		this.profissaoPai = profissaoPai;
	}

	public String getProfissaoMae() {
		return profissaoMae;
	}

	public void setProfissaoMae(String profissaoMae) {
		this.profissaoMae = profissaoMae;
	}

	public String getProvinciaFrequencia() {
		return provinciaFrequencia;
	}

	public void setProvinciaFrequencia(String provinciaFrequencia) {
		this.provinciaFrequencia = provinciaFrequencia;
	}

	public String getEscolaFrequencia() {
		return escolaFrequencia;
	}

	public void setEscolaFrequencia(String escolaFrequencia) {
		this.escolaFrequencia = escolaFrequencia;
	}

	public String getAnoConclusao() {
		return anoConclusao;
	}

	public void setAnoConclusao(String anoConclusao) {
		this.anoConclusao = anoConclusao;
	}

	public String getEntidadePatronalMae() {
		return entidadePatronalMae;
	}

	public void setEntidadePatronalMae(String entidadePatronalMae) {
		this.entidadePatronalMae = entidadePatronalMae;
	}

	public Integer getContactoPatronalMae() {
		return contactoPatronalMae;
	}

	public void setContactoPatronalMae(Integer contactoPatronalMae) {
		this.contactoPatronalMae = contactoPatronalMae;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public List<Documento> getDoc() {
		return doc;
	}

	public void setContactoPatronalPai(int contactoPatronalPai) {
		this.contactoPatronalPai = contactoPatronalPai;
	}

	public void setContactoPatronalMae(int contactoPatronalMae) {
		this.contactoPatronalMae = contactoPatronalMae;
	}

	public void setDoc(List<Documento> doc) {
		this.doc = doc;
	}

	public String getTipoBolsa() {
		return tipoBolsa;
	}

	public void setTipoBolsa(String tipoBolsa) {
		this.tipoBolsa = tipoBolsa;
	}
	
	

	
	
	
	// Metodos get e set

	
}
