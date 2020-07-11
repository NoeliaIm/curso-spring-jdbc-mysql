package com.cursospring.jdbc.springboot.mysql.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CursoDaoImpl implements CursoDao {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void createCurso() {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO cursos (nombreCurso) VALUES ('CURSO SPRING JDBC')");
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	}

