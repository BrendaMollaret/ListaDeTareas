package com.ListaTareas.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ListaTareas.demo.interfaceService.ITareaService;
import com.ListaTareas.demo.modelo.Tarea;



@Controller
@RequestMapping
public class Controlador{
	
	@Autowired
	private ITareaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Tarea>tareas = service.listar();
		model.addAttribute("tareas", tareas);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("tarea", new Tarea());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Tarea t, Model model) {
		service.save(t);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Tarea>tarea=service.listarId(id);
		model.addAttribute("tarea", tarea);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	
}
