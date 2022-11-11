package com.curso.AvanceProyectoIntegrador.service;

import com.curso.AvanceProyectoIntegrador.model.Usuario;

import java.util.List;
import java.util.Optional;


public interface IUsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Integer id);
    Usuario save (Usuario usuario);
    Optional<Usuario> findByEmail(String email);
}
