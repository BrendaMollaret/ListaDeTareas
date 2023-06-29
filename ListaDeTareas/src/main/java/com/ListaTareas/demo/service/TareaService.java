package com.ListaTareas.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ListaTareas.demo.interfaceService.ITareaService;
import com.ListaTareas.demo.interfaces.ITarea;
import com.ListaTareas.demo.modelo.Tarea;

@Service
public class TareaService implements ITareaService{
	
	@Autowired
	private ITarea data;

	@Override
	public List<Tarea> listar() {
		
		return (List<Tarea>)data.findAll(); //retorna lista de tareas //con casteo
	}

	@Override
	public Optional<Tarea> listarId(int id) {
		return data.findById(id);		
	}

	@Override
	public int save(Tarea t) {
		int respuesta=0;
		Tarea tarea=data.save(t);
		if (!tarea.equals(null)) {
			respuesta=1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
	
}
