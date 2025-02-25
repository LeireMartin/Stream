package metodos;

import java.util.Comparator;
import java.util.List;

import listas.ListaAlumnos;
import modelo.Alumno;

public class OrdenarAlumnos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Alumno>alumnos=ListaAlumnos.obtenerListaAlumnos();
		System.out.println("Alumos odenador por nota(descencente)");
		
		alumnos.stream()
		.sorted(Comparator.comparingDouble(Alumno::getNotaMedia).reversed())
		.forEach(System.out::println);
	}

}
