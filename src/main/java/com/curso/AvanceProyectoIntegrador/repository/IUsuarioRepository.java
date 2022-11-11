package com.curso.AvanceProyectoIntegrador.repository;

import java.util.Optional;

import com.curso.AvanceProyectoIntegrador.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	Optional<Usuario> findByEmail(String email);
}