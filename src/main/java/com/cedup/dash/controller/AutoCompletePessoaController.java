package com.cedup.dash.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cedup.dash.model.Pessoa;
import com.cedup.dash.repository.Pessoas;

@Controller
public class AutoCompletePessoaController {

		@Autowired
		private Pessoas pessoas;
		private List<Pessoa> data;
		 
		@PostConstruct
		public void init(){
			data = pessoas.findAll();
		}

		@RequestMapping(value = "/", method = RequestMethod.GET)
		public ModelAndView getPages() {

			ModelAndView model = new ModelAndView("example");
			return model;

		}

		@RequestMapping(value = "/getPessoas", method = RequestMethod.GET)
		public @ResponseBody
		List<Pessoa> getPessoas(@RequestParam String nomePessoa, @RequestParam String email) {
			return simulateSearchResult(nomePessoa, email);
		}

		private List<Pessoa> simulateSearchResult(String nomePessoa, String email) {
			List<Pessoa> result = new ArrayList<Pessoa>();
			// iterate a list and filter by tagName
			for (Pessoa pessoa : data) {
				if (pessoa.getNome().contains(nomePessoa) || pessoa.getEmail().contains(email)) {
					result.add(pessoa);
				}
			}
			return result;
		}

}
