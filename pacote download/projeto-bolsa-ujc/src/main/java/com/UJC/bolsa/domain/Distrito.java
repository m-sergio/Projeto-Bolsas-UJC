package com.UJC.bolsa.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "distritos")
public class Distrito extends AbstractEntity<Long> {

	@Column(name = "designacao", nullable = false, unique = true)
	private String designacao;

	@ManyToOne
	@JoinColumn(name = "id_provincia_fk")
	private Provincia provincia;
	


	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}



	
	
}
