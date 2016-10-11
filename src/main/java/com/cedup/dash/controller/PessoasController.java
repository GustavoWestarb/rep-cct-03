package com.cedup.dash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cedup.dash.model.Pessoa;
import com.cedup.dash.model.UserIntent;
import com.cedup.dash.repository.Pessoas;

@Controller
@RequestMapping("/pessoas")
public class PessoasController {

	@Autowired
	private Pessoas pessoas;	
	
	@RequestMapping("/novo")
	public String novo() {
		return "/pessoa/CadastroPessoa";
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView m = new ModelAndView("login/login");
		m.addObject("user", new UserIntent());
		return m;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logar(UserIntent u) {			
		List<Pessoa> p = this.pessoas.findAll();		
		for(int i = 0; i < p.size(); i++) {
			Pessoa pessoa = p.get(i);
			if((pessoa.getLogin().equals(u.getLogin())) && (pessoa.getSenha().equals(u.getPassword()))) {
				UserIntent.SET_INVALID(0);
				return "redirect:/pessoas/novo";
			}
		}
		UserIntent.SET_INVALID(1);
		return "redirect:/pessoas/login";
	}
	
	@RequestMapping
	public ModelAndView pesquisa() {
		ModelAndView mv = new ModelAndView("/pessoa/PesquisaPessoas");
		mv.addObject("pessoas", pessoas.findAll());
		return mv;
	}
	
}
