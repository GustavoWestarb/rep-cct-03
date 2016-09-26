package com.cedup.dash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cedup.dash.model.Pessoa;

public interface Pessoas extends JpaRepository<Pessoa, Long>{

}
