package com.ListaTareas.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ListaTareas.demo.modelo.Tarea;

@Repository
public interface ITarea extends CrudRepository<Tarea, Integer> {
	
}
