package com.cedup.dash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cedup.dash.repository.Pessoas;

@Controller
@RequestMapping("/pessoas")
public class PessoasController {

	@Autowired
	private Pessoas pessoas;
	
	@RequestMapping("/novo")
	public String novo() {
		return "/produto/CadastroProduto";
	}
	
	@RequestMapping
	public ModelAndView pesquisa() {
		ModelAndView mv = new ModelAndView("/pessoa/PesquisaPessoas");
		mv.addObject("pessoas", pessoas.findAll());
		return mv;
	}
	
}
