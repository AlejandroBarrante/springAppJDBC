package com.companyname.springapp.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.companyname.springapp.domain.Alumno;

public class AlumnoDaoImpl implements AlumnoDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Alumno> getAlumnos() {

		String SQL = "SELECT a.nombre, a.apellidos, p.nombre as nombreProf, p.apellidos as apellidoProf, a.fecha_alta, p.asignatura FROM Alumnos a, Profesores p WHERE a.id_profesor = p.id_profesor ";
		List<Alumno> alumnos = jdbcTemplateObject.query(SQL, new AlumnoMapper());
		return alumnos;
	}

}
