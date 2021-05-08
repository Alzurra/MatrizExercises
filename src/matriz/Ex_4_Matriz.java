package matriz;

import java.util.Random;

public class Ex_4_Matriz {

	public static void main(String[] args) {

		// 4. Leia duas matrizes 4 x 4 e
		// escreva uma terceira com os maiores valores de cada posição das matrizes
		// lidas.

		int m1[][] = new int[4][4];
		int m2[][] = new int[4][4];
		int m3[][] = new int[4][4];

		Random rand = new Random();

		System.out.println("MATRIZ M1");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				m1[l][c] = rand.nextInt(20);
				System.out.print("[" + m1[l][c] + "]");
			}

			System.out.println();
		}

		System.out.println();

		System.out.println("MATRIZ M2");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				m2[l][c] = rand.nextInt(20);
				System.out.print("[" + m2[l][c] + "]");
			}

			System.out.println();
		}

		System.out.println();

		System.out.println("MATRIZ PREENCHIDA COM OS MAIORES VALORES DE CADA MATRIZ(M1,M2)");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {

				if (m1[l][c] > m2[l][c]) {
					m3[l][c] = m1[l][c];
				} else {
					m3[l][c] = m2[l][c];
				}

				System.out.print("[" + m3[l][c] + "]");
			}

			System.out.println();
		}

	}
}
