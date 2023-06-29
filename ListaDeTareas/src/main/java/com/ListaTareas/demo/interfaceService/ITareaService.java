package com.ListaTareas.demo.interfaceService;


import java.util.List;
import java.util.Optional;

import com.ListaTareas.demo.modelo.Tarea;

public interface ITareaService {
	public List<Tarea>listar(); //CRUD Listar
	public Optional<Tarea>listarId(int id); //CRUD Listar por id
	public int save(Tarea t);
	public void delete(int id);
}
