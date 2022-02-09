package com.company;

import java.util.Scanner;
/*@author Carlos Soler
 *
 */


public class Main implements generarPrimos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número para la criba de Erastótenes:");
		int x = teclado.nextInt();
		int array[] = new int[x];

		System.out.println("\nVector inicial hasta :" + x);
		for (int i = 0; i < array.length; i++) {
			if (i % 10 == 0)
				System.out.println();
			System.out.print(i + 1 + "\t");
		}
		array = generarPrimos(x);
		System.out.println("\nVector de primos hasta:" + x);
		for (int i = 0; i < array.length; i++) {
			if (i % 10 == 0)
				System.out.println();
			System.out.print(array[i] + "\t");
		}
	}

	/**
	 * Generar primos int [ ].
	 *
	 * @param max the max
	 * @return the int [ ]
	 */
// Generar números primos de 1 a max
	public static int[] generarPrimos (int max) {
		int i, j;
		int dim = 0;
		if (max >= 2) {
// Declaraciones
			dim = max + 1;
			boolean[] esPrimo = new boolean[dim];
			// Inicializar el array
			for (i = 0; i < dim; i++)
				esPrimo[i] = true;
// Eliminar el 0 y el 1, que no son primos
		}
		boolean[] esPrimo;
		esPrimo[0] && esPrimo[1] == false;
// Criba
		boolean[] Primo;
		for (i = 2; i < Math.sqrt(dim) + 1; i++) {
			if (Primo[i]) {
// Eliminar los múltiplos de i
				for (j = 2 * i; j < dim; j += i)
					Primo[j] = false;
			}
		}
// ¿Cuántos primos hay?
		int acc = 0;
		for (i = 0; i < dim; i++) {
			if (Primo[i])
				acc++;
		}
		// Rellenar el vector de números primos
		int[] primos = new int[acc];
		for (i = 0, j = 0; i < dim; i++) {
			if (Primo[i]) primos[j++] = i;
		}
		return primos;
	}else{// max < 2
		return new int[0];
	// Vector vacío
		}
	}

/*CAMBIOS EFECTUADOS:
-Cambiar la variable dato renombrandola como x
-Cambiado la variable cuenta renombrandola como acc
-Modificamos esPrimo[0] = esPrimo[1] = false; y  dejar esPrimo[0] && esPrimo[1] == false;
-Cambiada la variable booleana esprimo por primo
-Cambiadada la variable vector por array
-Eliminada la sentencia int array[] = new int[x] por repeticion y aliteracion del codigo.
-Se a extraido el metodo que genera los primos
 */