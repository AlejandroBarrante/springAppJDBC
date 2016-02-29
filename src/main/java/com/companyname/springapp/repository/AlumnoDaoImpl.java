package com.companyname.springapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.companyname.springapp.domain.Alumno;

public class AlumnoDaoImpl implements AlumnoDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Alumno> getAlumnos() {
		String SQL = "select * from Alumnos";

		List<Alumno> listAlumnos = jdbcTemplateObject.query(SQL, new RowMapper<Alumno>() {
			public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
				Alumno oAlumno = new Alumno();

				oAlumno.setIdAlumno(rs.getInt("id_alumno"));
				oAlumno.setNombre(rs.getString("nombre"));
				oAlumno.setApellidos(rs.getString("apellidos"));
				oAlumno.setFechaAlta(rs.getDate("fecha_alta"));

				return oAlumno;
			}

		});

		return listAlumnos;

	}

}