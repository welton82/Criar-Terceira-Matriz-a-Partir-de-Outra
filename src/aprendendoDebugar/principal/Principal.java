package aprendendoDebugar.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] vetA = new int[3][3];
		int[][] vetB = new int[3][3];
		int[][] vetC = new int[3][3];

		System.out.println("INFORME A MATRIZ A: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("linha: " + l + " - coluna: " + c + " = ");
				vetA[l][c] = sc.nextInt();
			}
		}

		System.out.println("INFORME A MATRIZ B: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("linha: " + l + " - coluna: " + c + " = ");
				vetB[l][c] = sc.nextInt();
			}
		}

		System.out.println("============ MATRIZ 'A' INFORMADA ==========");

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < vetA[0].length; c++) {
				System.out.print(vetA[l][c] + "\t");
			}
			System.out.println();
		}

		System.out.println("============ MATRIZ 'B' INFORMADA ==========");

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < vetB[0].length; c++) {
				System.out.print(vetB[l][c] + "\t");
			}
			System.out.println();
		}

		int[] y = new int[9];
		int[] x = new int[9];
		int xy[] = new int[18];

		int k = 0;
		// ORDENAÇÃO Vetor A
		for (int l = 0; l < 3; l++) {

			for (int c = 0; c < 3; c++) {
				x[k] = vetA[l][c];
				k++;
			}
		}
		// ORDEAÇÃO VETOR B
		k = 0;
		for (int l = 0; l < 3; l++) {

			for (int c = 0; c < 3; c++) {
				y[k] = vetB[l][c];
				k++;
			}
		}
		System.out.println();
//		System.out.println("============ VETOR 'X' DE 'A' GERADA ===========");
//
//		for (int l = 0; l < 9; l++) {
//
//			System.out.print(x[l] + "\t");
//		}
//		System.out.println();
//		System.out.println("============ VETOR 'Y' DE 'B' GERADA ===========");
//
//		for (int l = 0; l < 9; l++) {
//
//			System.out.print(y[l] + "\t");
//		}
		System.out.println();
		System.out.println("========== vetor 'A' COM VALORES ORDENADOS  ===================");

		k = 0;
		int maior = 0;
		int i = -1;
		for (int l = 0; l < 9 - 1; l++) {

			for (int c = l + 1; c < 9; c++) {

				if (x[l] < x[c]) {
					maior = x[c];
					x[c] = x[l];
					x[l] = maior;
				}
			}

		}

		for (int l = 0; l < 9; l++) {

			System.out.print(x[l] + "\t");
		}
		System.out.println();

		System.out.println("========== vetor 'B' COM VALORES ORDENADOS  ===================");

		maior = 0;

		for (int l = 0; l < 9 - 1; l++) {

			for (int c = l + 1; c < 9; c++) {

				if (y[l] < y[c]) {
					maior = y[c];
					y[c] = y[l];
					y[l] = maior;
				}
			}

		}

		for (int l = 0; l < 9; l++) {

			System.out.print(y[l] + "\t");
		}

		System.out.println();

		System.out.println("================= VETOR XY ================");

		k = 0;
		for (int l = 0; l < 9; l++) {

			xy[k] = x[l];
			k++;

		}
		
		for (int l = 0; l < 9; l++) {

			xy[k] = y[l];
			k++;

		}
		
		
		for (int l = 0; l < 18 - 1; l++) {
			for (int c = l + 1; c < xy.length; c++) {

				if (xy[l] < xy[c]) {
					maior = xy[c];
					xy[c] = xy[l];
					xy[l] = maior;
				}
			}

		}
		
		for (i = 0; i < 18; i++) {
			System.out.print(xy[i] + "\t");
		}

		System.out.println();
		System.out.println("TERCEIRA MATRIZ COM VALORES MAIORES");

		i=0;
		for(int l=0; l<3;l++) {
			for(int c=0;c<3;c++) {
				
				vetC[l][c] = xy[i];
				i++;
			}
		}
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < vetB[0].length; c++) {
				System.out.print(vetC[l][c] + "\t");
			}
			System.out.println();
		}

	}

}
