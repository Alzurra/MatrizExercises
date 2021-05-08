package matriz;

public class Ex_2_Matriz {

	public static void main(String[] args) {

		// 2. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os
		// demais elementos.
		// Escreva ao final a matriz obtida.

		int m[][] = new int[5][5];

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {

				if (l == c) {
					m[l][c] = 1;
				} else {
					m[l][c] = 0;
				}
			}
		}

		System.out.println("MATRIZ DIAGONAL PRINCIPAL [1]");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.print("[" + m[l][c] + "]");
			}
			System.out.println();
		}

	}
}
