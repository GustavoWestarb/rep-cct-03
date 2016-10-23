package com.cedup.dash.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "tb_mensagem")
public class Mensagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="msg_id")
	private Long id;
	
	@Column(name = "msg_conteudo")
	private String conteudo;
	
	@Column(name = "msg_assunto")
	private String assunto;
	
	@Column(name = "msg_horaenvio", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaEnvio;
	
	@Column(name = "status")
	private Integer status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "msg_idrem")
	private Pessoa remetente;
	
	@Column(name = "ativo")
	private Integer ativo;
	
	@Column(name = "msg_prazoinicial", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date prazoInicial;	

	@Column(name = "msg_prazofinal", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date prazoFinal;	
	
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
		Mensagem other = (Mensagem) obj;
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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getHoraEnvio() {
		return horaEnvio;
	}

	public void setHoraEnvio(Date horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Pessoa getRemetente() {
		return remetente;
	}

	public void setRemetente(Pessoa remetente) {
		this.remetente = remetente;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Date getPrazoInicial() {
		return prazoInicial;
	}

	public void setPrazoInicial(Date prazoInicial) {
		this.prazoInicial = prazoInicial;
	}

	public Date getPrazoFinal() {
		return prazoFinal;
	}

	public void setPrazoFinal(Date prazoFinal) {
		this.prazoFinal = prazoFinal;
	}
	
	
	
}
