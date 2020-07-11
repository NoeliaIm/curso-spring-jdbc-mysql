package com.cursospring.jdbc.springboot.mysql.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CursoSpringJdbcMysqlApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CursoDaoImpl cursoDaoImpl = context.getBean("cursoDaoImpl", CursoDaoImpl.class);
		cursoDaoImpl.createCurso();
		context.close();
	}

}
