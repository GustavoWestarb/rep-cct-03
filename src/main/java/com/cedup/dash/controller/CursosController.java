package com.cedup.dash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cedup.dash.model.Curso;
import com.cedup.dash.repository.Cursos;

@Controller
@RequestMapping("/curso")
public class CursosController {
	
	@Autowired
	private Cursos curso;
	
	@RequestMapping("/cadastro")
	public ModelAndView cadastroCurso() {
		ModelAndView m = new ModelAndView("curso/CadastroCurso");
		m.addObject("curso", new Curso());
		m.addObject("message", 0);
		return m;
	}
	
	public ModelAndView cadastroCurso(Integer showMessage) {
		ModelAndView m = new ModelAndView("curso/CadastroCurso");
		m.addObject("curso", new Curso());
		m.addObject("message", showMessage);
		return m;
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ModelAndView cadastrar(Curso c) {
		this.curso.save(c);		
		return this.cadastroCurso(1);
	}
	
}
