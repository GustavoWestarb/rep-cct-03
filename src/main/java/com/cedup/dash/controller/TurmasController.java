package com.cedup.dash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cedup.dash.model.Turma;
import com.cedup.dash.repository.Cursos;
import com.cedup.dash.repository.Turmas;

@Controller
@RequestMapping("/turma")
public class TurmasController {

	@Autowired
	private Turmas turma;
	@Autowired
	private Cursos curso;
	
	@RequestMapping("/cadastro")
	public ModelAndView cadastroTurma() {
		ModelAndView m = new ModelAndView("turma/CadastroTurma");
		m.addObject("turma", new Turma());
		m.addObject("curso", this.curso.findAll());
		m.addObject("message", 0);
		return m;
	}
	
	public ModelAndView cadastroTurma(Integer message) {
		ModelAndView m = new ModelAndView("turma/CadastroTurma");
		m.addObject("turma", new Turma());
		m.addObject("curso", this.curso.findAll());
		m.addObject("message", message);
		return m;
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ModelAndView cadastrar(Turma t) {		
		this.turma.save(t);		
		return this.cadastroTurma(1);
	}
	
}
