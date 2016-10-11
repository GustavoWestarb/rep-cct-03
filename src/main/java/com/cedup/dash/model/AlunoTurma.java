package com.cedup.dash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "tb_alutur")
public class AlunoTurma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alutur_id")
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "alutur_turid")
	@Fetch(FetchMode.JOIN)
	private Turma turma;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "alutur_aluid")
	@Fetch(FetchMode.JOIN)
	private Pessoa aluno;

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
		AlunoTurma other = (AlunoTurma) obj;
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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Pessoa getAluno() {
		return aluno;
	}

	public void setAluno(Pessoa aluno) {
		this.aluno = aluno;
	}

}
