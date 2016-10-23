package com.cedup.dash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cedup.dash.model.Mensagem;

public interface Mensagens extends JpaRepository<Mensagem, Long>{

}
