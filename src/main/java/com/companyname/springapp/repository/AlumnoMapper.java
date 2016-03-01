package com.companyname.springapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.companyname.springapp.domain.Alumno;

public class AlumnoMapper implements RowMapper<Alumno> {
	public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
		Alumno oAlumno = new Alumno();
		oAlumno.setNombre(rs.getString("nombre"));
		oAlumno.setApellidos(rs.getString("apellidos"));
		oAlumno.setNombreCompletoAlumno(rs.getString("nombre") + rs.getString("apellidos"));
		oAlumno.setFechaAlta(rs.getDate("fecha_alta"));
		oAlumno.setAsignatura(rs.getString("asignatura"));
		oAlumno.setNombreProf(rs.getString("nombreProf"));
		oAlumno.setApellidoProf(rs.getString("apellidoProf"));
		oAlumno.setNombreCompletoProf(rs.getString("nombreProf") + rs.getString("apellidoProf"));

		return oAlumno;
	}
}