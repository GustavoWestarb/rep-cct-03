package com.cedup.dash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cedup.dash.model.Mensagem;
import com.cedup.dash.model.MensagemDest;
import com.cedup.dash.repository.Mensagens;

@Controller
@RequestMapping("/mensagens")
public class MensagensController {

	@Autowired
	Mensagens mensagens;
	
	@RequestMapping("/caixa/entrada")
	public ModelAndView loadCaixaEntrada(Mensagem mensagem, MensagemDest mensagemDest) {
		ModelAndView mv = new ModelAndView("/mensagens/CaixaEntrada");
		mv.addObject("mensagens", mensagens.findAll());
		return mv; 
	}
	
	@RequestMapping("/caixa/saida")
	public ModelAndView loadCaixaSaida(Mensagem mensagem, MensagemDest mensagemDest) {
		ModelAndView mv = new ModelAndView("/mensagens/CaixaSaida");
		mv.addObject("mensagens", mensagens.findAll());
		return mv; 
	}
	
	
}
