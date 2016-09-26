package com.cedup.dash.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
	//EXEMPLO DE ENUM =		 @Enumerated(EnumType.STRING);
	/*Atributos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pes_id")
	private Long id;
	
	@Column(name="pes_nome")
	private String nome;
	
	@Column(name="pes_nomesoc")
	private String nomeSocial;
	
	@Column(name="pes_datanasc")
	private Date dataNasc;
	
	@Column(name="pes_isaluno")
	private Integer isAluno;
	
	@Column(name="pes_isprofessor")
	private Integer isProfessor;
	
	@Column(name="pes_iscoordenador")
	private Integer isCoordenador;
	
	@Column(name="pes_issecretaria")
	private Integer isSecretaria;
	
	/*HashCode e Equals*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/*Getters e setters*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeSocial() {
		return nomeSocial;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Integer getIsAluno() {
		return isAluno;
	}
	public void setIsAluno(Integer isAluno) {
		this.isAluno = isAluno;
	}
	public Integer getIsProfessor() {
		return isProfessor;
	}
	public void setIsProfessor(Integer isProfessor) {
		this.isProfessor = isProfessor;
	}
	public Integer getIsCoordenador() {
		return isCoordenador;
	}
	public void setIsCoordenador(Integer isCoordenador) {
		this.isCoordenador = isCoordenador;
	}
	public Integer getIsSecretaria() {
		return isSecretaria;
	}
	public void setIsSecretaria(Integer isSecretaria) {
		this.isSecretaria = isSecretaria;
	}
}
