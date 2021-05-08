package matriz;

import java.util.Random;

public class Ex_1_Matriz {

	public static void main(String[] args) {

		// 1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela
		// possui.

		int m[][] = new int[4][4];
		int cont = 0;

		Random rand = new Random();

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				m[l][c] = rand.nextInt(15);
				System.out.print("[" + m[l][c] + "]");

				if (m[l][c] > 10) {
					cont++;
				}

			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Quantidade de números: " + cont);

	}
}
