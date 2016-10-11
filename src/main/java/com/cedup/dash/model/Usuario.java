package com.cedup.dash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usu_id")
	private Long id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="pes_id")
	@Fetch(FetchMode.JOIN)
	private Pessoa pessoa;
	
	@Column(name="usu_login")
	private String username;
	
	@Column(name="usu_senha")
	private String password;
	
	@Column(name="usu_eAluno")
	private Integer isAluno;
	
	@Column(name="usu_eProfessor")
	private Integer isProfessor;
	
	@Column(name="usu_eCoordenador")
	private Integer isCoordenador;
	
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
}
