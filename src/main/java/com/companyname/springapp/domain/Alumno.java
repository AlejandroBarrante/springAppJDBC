package com.companyname.springapp.domain;

import java.io.Serializable;
import java.util.Date;

public class Alumno implements Serializable {

	private Integer idAlumno;
	private String nombre;
	private String apellidos;
	private Date fechaAlta;
	private Integer idProfesor;
	private String asignatura;
	private String nombreProf;
	private String apellidoProf;
	private String nombreCompletoProf;
	private String nombreCompletoAlumno;

	public Alumno() {
	}

	public Alumno(Integer idAlumno, String nombre, String apellidos, Date fechaAlta, Integer idProfesor,
			String asignatura, String nombreProf, String apellidoProf, String nombreCompletoProf,
			String nombreCompletoAlumno) {
		this.idProfesor = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaAlta = fechaAlta;
		this.idProfesor = idProfesor;
		this.asignatura = asignatura;
		this.nombreProf = nombreProf;
		this.apellidoProf = apellidoProf;
		this.nombreCompletoProf = nombreCompletoProf;
		this.nombreCompletoAlumno = nombreCompletoAlumno;

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

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getNombreProf() {
		return nombreProf;
	}

	public void setNombreProf(String nombreProf) {
		this.nombreProf = nombreProf;
	}

	public String getApellidoProf() {
		return apellidoProf;
	}

	public void setApellidoProf(String apellidoProf) {
		this.apellidoProf = apellidoProf;
	}

	public String getNombreCompletoProf() {
		return nombreCompletoProf;
	}

	public void setNombreCompletoProf(String nombreCompletoProf) {
		this.nombreCompletoProf = nombreProf + " " + apellidoProf;
	}

	public String getNombreCompletoAlumno() {
		return nombreCompletoAlumno;
	}

	public void setNombreCompletoAlumno(String nombreCompletoAlumno) {
		this.nombreCompletoAlumno = nombre + " " + apellidos;
	}

}