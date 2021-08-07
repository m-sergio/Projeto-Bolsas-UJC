package com.UJC.bolsa.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@SuppressWarnings("serial")
@Entity
@Table(name = "documentos")
public class Documento extends AbstractEntity<Long> {
	
	//Atributos 
		@Column(name = "atestado_pobreza", nullable = false)
		private String atestadoPobreza;
		
		@Column(name = "atestado_residencia", nullable = false)
		private String atestadoResidencia;
		
		
		@Column(name = "dec_rendimentoEncaregado", nullable = false)
		private String declaracaoRendimento;
		
		
		@Column(name = "dec_agregadoFamiliar", nullable = false)
		private String declaracaoAgregado;
		
		@ManyToOne
		@JoinColumn(name = "id_candidato_fk")
		private Candidato candidato;
		


		public String getAtestadoPobreza() {
			return atestadoPobreza;
		}


		public void setAtestadoPobreza(String atestadoPobreza) {
			this.atestadoPobreza = atestadoPobreza;
		}


		public String getAtestadoResidencia() {
			return atestadoResidencia;
		}


		public void setAtestadoResidencia(String atestadoResidencia) {
			this.atestadoResidencia = atestadoResidencia;
		}


		public String getDeclaracaoRendimento() {
			return declaracaoRendimento;
		}


		public void setDeclaracaoRendimento(String declaracaoRendimento) {
			this.declaracaoRendimento = declaracaoRendimento;
		}


		public String getDeclaracaoAgregado() {
			return declaracaoAgregado;
		}


		public void setDeclaracaoAgregado(String declaracaoAgregado) {
			this.declaracaoAgregado = declaracaoAgregado;
		}


		public Candidato getCandidato() {
			return candidato;
		}


		public void setCandidato(Candidato candidato) {
			this.candidato = candidato;
		}

		
		
		
		
		
	

}
