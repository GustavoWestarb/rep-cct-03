package com.cedup.dash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedup.dash.model.Pessoa;
import com.cedup.dash.repository.Pessoas;

@Service
public class CadastroPessoaService {
	
	@Autowired
	private Pessoas pessoas;
	
	public void salvar(Pessoa pessoa){
		//regras de negócio...
		verificaTipoPessoa(pessoa);
		
		this.pessoas.save(pessoa);
	}

	private void verificaTipoPessoa(Pessoa pessoa) {
		if(pessoa.getEhAdmin() == null)
			pessoa.setEhAdmin(0);
		
		if(pessoa.getEhProfessor() == null)
			pessoa.setEhProfessor(0);
		
		if(pessoa.getEhAluno() == null)
			pessoa.setEhAluno(0);
	}
}
