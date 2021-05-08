package matriz;

public class Ex_3_Matriz {

	public static void main(String[] args) {

		// 3. Faça um programa que preenche uma matriz 4 x 4 com o produto
		// do valor da linha e da coluna de cada elemento. Em seguida, imprima na tela a
		// matriz.

		int m[][] = new int[4][4];

		System.out.println("MATRIZ M[l][c] = l*c");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {

				m[l][c] = l * c;

				System.out.print("[" + m[l][c] + "]");

			}

			System.out.println();
		}

	}
}
