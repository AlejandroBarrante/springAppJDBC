package com.companyname.springapp.domain;

import java.io.Serializable;
import java.util.Date;

public class Alumno implements Serializable {

	private Integer idAlumno;
	private String nombre;
	private String apellidos;
	private Date fechaAlta;
	private Integer idProfesor;

	public Alumno() {
	}

	public Alumno(Integer idAlumno, String nombre, String apellidos, Date fechaAlta, Integer idProfesor) {
		this.idProfesor = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaAlta = fechaAlta;
		this.idProfesor = idProfesor;


	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
}