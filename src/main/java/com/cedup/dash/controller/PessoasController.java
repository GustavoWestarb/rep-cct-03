package com.cedup.dash.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cedup.dash.model.Pessoa;
import com.cedup.dash.repository.Pessoas;
import com.cedup.dash.service.CadastroPessoaService;

@Controller
@RequestMapping("/pessoas")
public class PessoasController {

	@Autowired
	private CadastroPessoaService cadastroPessoaService;
	
	@Autowired
	private Pessoas pessoas;	
	
	@RequestMapping("/novo")
	public ModelAndView novo(Pessoa pessoa) {
		ModelAndView mv = new ModelAndView("/pessoa/CadastroPessoa");
		return mv; 
	}
	
	/**
	 * 
	 * public ModelAndView salvar(@Valid Vinho vinho, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(vinho);
		}
		
		cadastroVinhoService.salvar(vinho);
		attributes.addFlashAttribute("mensagem", "Vinho salvo com sucesso!");
		return new ModelAndView("redirect:/vinhos/novo");
	}
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(value= "/novo", method=RequestMethod.POST)
	public ModelAndView salvar(@Valid Pessoa pessoa, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors())
			return novo(pessoa);

		
		cadastroPessoaService.salvar(pessoa);
		return new ModelAndView("redirect:/pessoas/novo");
	}

	@RequestMapping
	public ModelAndView pesquisa() {
		ModelAndView mv = new ModelAndView("/pessoa/PesquisaPessoas");
		mv.addObject("pessoas", pessoas.findAll());
		return mv;
	}
	
}
