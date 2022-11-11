package com.curso.AvanceProyectoIntegrador.repository;


import java.util.List;

import com.curso.AvanceProyectoIntegrador.model.Orden;
import com.curso.AvanceProyectoIntegrador.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
    List<Orden> findByUsuario (Usuario usuario);
}
