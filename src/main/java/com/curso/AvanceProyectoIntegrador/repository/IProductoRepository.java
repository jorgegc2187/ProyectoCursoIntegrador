package com.curso.AvanceProyectoIntegrador.repository;

import com.curso.AvanceProyectoIntegrador.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}