package com.cedup.dash.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


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
	@NotNull
	private String nome;
	
	@Column(name="pes_telefone")
	private String telefone;	
	
	@Column(name = "pes_dataNasc", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNasc;

	@Column(name="pes_numeroDoc1")
	private String numeroDoc1;

	@Column(name="pes_numeroDoc2")
	private String numeroDoc2;
	
	@Column(name="pes_sexo")
	@NotNull
	private Character sexo;

	@Column(name="pes_login")
	@NotNull
	private String login;
	
	@Column(name="pes_senha")
	@NotNull
	private String senha;	
	
	@Column(name="pes_ehAluno")
	private Integer ehAluno;
	
	@Column(name="pes_ehProfessor")
	private Integer ehProfessor;
	
	@Column(name="pes_ehSysAdmin")
	private Integer ehAdmin;
	
	@Column(name="pes_email")
	@NotNull
	private String email;	

	@Column(name="pes_email2")
	private String email2;
	
	@Column(name = "pes_endereco")
    private String endereco;
	
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
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNumeroDoc1() {
		return numeroDoc1;
	}
	public void setNumeroDoc1(String numeroDoc1) {
		this.numeroDoc1 = numeroDoc1;
	}
	public String getNumeroDoc2() {
		return numeroDoc2;
	}
	public void setNumeroDoc2(String numeroDoc2) {
		this.numeroDoc2 = numeroDoc2;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getEhAluno() {
		return ehAluno;
	}
	public void setEhAluno(Integer ehAluno) {
		this.ehAluno = ehAluno;
	}
	public Integer getEhProfessor() {
		return ehProfessor;
	}
	public void setEhProfessor(Integer ehProfessor) {
		this.ehProfessor = ehProfessor;
	}
	public Integer getEhAdmin() {
		return ehAdmin;
	}
	public void setEhAdmin(Integer ehAdmin) {
		this.ehAdmin = ehAdmin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}