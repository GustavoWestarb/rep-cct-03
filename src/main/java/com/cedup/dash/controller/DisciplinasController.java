package com.cedup.dash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cedup.dash.model.Curso;
import com.cedup.dash.model.Disciplina;
import com.cedup.dash.repository.Disciplinas;

@Controller
@RequestMapping("/disciplina")
public class DisciplinasController {

	@Autowired
	private Disciplinas disciplina;
	
	@RequestMapping("/cadastro")
	public ModelAndView cadastroDisciplina() {
		ModelAndView m = new ModelAndView("disciplina/CadastroDisciplina");
		m.addObject("disciplina", new Disciplina());
		m.addObject("message", 0);
		return m;
	}
	
	public ModelAndView cadastroDisciplina(Integer message) {
		ModelAndView m = new ModelAndView("disciplina/CadastroDisciplina");
		m.addObject("disciplina", new Disciplina());
		m.addObject("message", message);
		return m;
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ModelAndView cadastrar(Disciplina d) {
		this.disciplina.save(d);		
		return this.cadastroDisciplina(1);
	}
	
}
