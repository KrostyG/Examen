package com.example.practicaSpring1111;

import com.example.practicaSpring1111.Entity.Prestamo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PracticaSpring1111Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticaSpring1111Application.class, args);
		Date fecha2 = new Date();
		System.out.println(fecha2);
	}

}
