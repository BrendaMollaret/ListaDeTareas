package com.ListaTareas.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tarea")
public class Tarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Hace referencia a que el "int id" va a ser la clave primaria de Tarea
	private int id;
	private String nombre;
	private String fechaVencimiento;
	private String prioridad;

	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}

	public Tarea(int id, String nombre, String fechaVencimiento, String prioridad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaVencimiento = fechaVencimiento;
		this.prioridad = prioridad;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}


	

}
