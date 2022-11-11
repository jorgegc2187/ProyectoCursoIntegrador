package com.curso.AvanceProyectoIntegrador.service;

import org.springframework.stereotype.Service;

import com.curso.AvanceProyectoIntegrador.model.DetalleOrden;

@Service
public interface IDetalleOrdenService {

	DetalleOrden save(DetalleOrden detalleOrden);
}
