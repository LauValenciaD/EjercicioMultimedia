package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * switch(expresion) { case valor1: instrucciones break; case valor2:
		 * instrucciones break; default: instrucciones break;
		 */
		Multimedia[] array = new Multimedia[20];
		int contador = 0;
		System.out.println("Bienvenido al menu. Seleciona opcion: insertar/ver/salir");
		Scanner sc = new Scanner(System.in);
		String seleccion = sc.nextLine();
		switch (seleccion) {
		case "insertar": {
			System.out.println("Introduce el tipo de multimedia: pelicula, disco o video.");
			String objeto = sc.nextLine();
			if (objeto.equalsIgnoreCase("pelicula")) {
				boolean correcto = false;
				String titulo = null;
				String autor = null;
				String formato = null;
				double duracion = 0;
				String actor = null;
				String actriz = null;
				while (!correcto) // validar
				{
					System.out.println("Introduce titulo:");
					titulo = sc.nextLine();
					System.out.println("Introduce autor:");
					autor = sc.nextLine();
					System.out.println("Introduce formato:");
					formato = sc.nextLine();
					System.out.println("Introduce duracion:");
					duracion = sc.nextDouble();
					correcto = Multimedia.validador(titulo, autor, formato, duracion);
				}
				System.out.println("Introduce actor principal:");
				actor = sc.nextLine();
				System.out.println("Introduce actriz principal:");
				actriz = sc.nextLine();
				array[contador] = new Pelicula(titulo, autor, formato, duracion, actor, actriz);
				contador++;
			}
			if (objeto.equalsIgnoreCase("disco")) {
				boolean correcto = false;
				String titulo = null;
				String autor = null;
				String formato = null;
				double duracion = 0;
				String genero = null;
				while (!correcto) // validar
				{
					System.out.println("Introduce titulo:");
					titulo = sc.nextLine();
					System.out.println("Introduce autor:");
					autor = sc.nextLine();
					System.out.println("Introduce formato:");
					formato = sc.nextLine();
					System.out.println("Introduce duracion:");
					duracion = sc.nextDouble();
					correcto = Multimedia.validador(titulo, autor, formato, duracion);
				}

				do {
					System.out.println("Introduce el genero:");
					genero = sc.nextLine();
					correcto = Disco.validaDisco(genero);
				} while (!correcto);
				array[contador] = new Disco(titulo, autor, formato, duracion, genero);
				contador++;
			}
			if (objeto.equalsIgnoreCase("video")) {
				boolean correcto = false;
				String titulo = null;
				String autor = null;
				String formato = null;
				double duracion = 0;
				while (!correcto) // validar
				{
					System.out.println("Introduce titulo:");
					titulo = sc.nextLine();
					System.out.println("Introduce autor:");
					autor = sc.nextLine();
					System.out.println("Introduce formato:");
					formato = sc.nextLine();
					System.out.println("Introduce duracion:");
					duracion = sc.nextDouble();
					correcto = Multimedia.validador(titulo, autor, formato, duracion);
				}
				array[contador] = new Video(titulo, autor, formato, duracion);
				contador++;
			}
		}
		case "ver": {
				for (int i = 0; i < contador; i++) {
						if (array[i] instanceof Pelicula) {
							Pelicula p = (Pelicula) array[i];
							p.toString();
							}
						if (array[i] instanceof Disco) {
							Disco d = (Disco) array[i];
							d.toString();
							}

						if (array[i] instanceof Video) {
							Video v = (Video) array[i];
							v.toString();
							}
						}
				}
		case "salir": break;
		}

	}
}
