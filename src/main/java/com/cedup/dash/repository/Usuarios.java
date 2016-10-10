package com.cedup.dash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cedup.dash.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long>{

}
