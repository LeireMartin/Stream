package metodos;

import java.util.List;
import java.util.stream.Collectors;

import listas.ListaAlumnos;
import modelo.Alumno;

public class NombreAlumnos {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		List<Alumno>alumnos=ListaAlumnos.obtenerListaAlumnos();
		
		List<String> nombres=alumnos.stream()
				.map(Alumno::getNombre)
				.collect(Collectors.toList());
		
		System.out.println("Lista de nombres de alumnos:");
		nombres.forEach(System.out::println);
		
		
	}

}
