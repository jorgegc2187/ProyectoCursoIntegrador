package com.curso.AvanceProyectoIntegrador.service;

import com.curso.AvanceProyectoIntegrador.model.Orden;
import com.curso.AvanceProyectoIntegrador.model.Usuario;

import java.util.List;
import java.util.Optional;


public interface IOrdenService {
    List<Orden> findAll();
    Optional<Orden> findById(Integer id);
    Orden save (Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario (Usuario usuario);
}