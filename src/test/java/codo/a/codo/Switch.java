package codo.a.codo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//escribiendo swi ctrl+enter se arma la estructura
		//en js const variable = prompt('algo')
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese nota");
		int nota = teclado.nextInt(); //quiero leer la nota desde teclado
		
		switch (nota) {
			case 7:
				System.out.println("aprobado");
				break;
			case 10:
				System.out.println("excelente");
				break;
			default:
				System.out.println("no es aprobado");
				break;
			}
		//necesito cerrar teclado
		teclado.close();
	}

}
