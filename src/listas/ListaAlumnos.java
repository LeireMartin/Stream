package listas;

import java.util.Arrays;
import java.util.List;

import modelo.Alumno;

public class ListaAlumnos {

	public static List<Alumno> obtenerListaAlumnos(){
		return Arrays.asList(
				new Alumno("Ana","1ºDAM",8.5),
				new Alumno("Juan","2ºDAM",5.5),
				new Alumno("Luis","1ºDAW",7.5),
				new Alumno("Manu","2ºDAW",6.5),
				new Alumno("Ola","1ºDAM",5.3)
				);
		
	}

}
