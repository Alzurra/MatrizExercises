package matriz;

import java.util.Random;

public class Ex_5_Matriz {

	public static void main(String[] args) {

		// 5. Leia uma matriz de 3 x 3 elementos.
		// Calcule a soma dos elementos que estão na diagonal principal.

		int m[][] = new int[3][3];
		int soma = 0;

		Random rand = new Random();

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				m[l][c] = rand.nextInt(25);
				System.out.print("[" + m[l][c] + "]");
			}

			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			soma += m[i][i];
		}

		System.out.println();

		System.out.println("SOMA DOS VALORES NA DIAGONAL PRINCIPAL");
		System.out.println(soma);

	}
}
