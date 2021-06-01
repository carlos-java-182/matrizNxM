package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class nxm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int matriz[][];
		int n, m;

		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de filas"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de columnas"));

		matriz = new int[n][m];

		int matrizSumaFilas[] = new int[n];
		int matrizSumaCols[] = new int[m];

		System.out.println("Ingresa los números de la matriz\n");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				System.out.print("Matriz ["+i+"]"+"["+j+"]: ");
				matriz[i][j] = entrada.nextInt();

			}
		}
		
		System.out.println("La matriz es: ");
		
		for(int i=0; i<n; i++) {
			for( int j=0; j<m; j++) {
				System.out.print(matriz[i][j]+" - ");
			}
			
			System.out.println("\n");
		}

		// Suma de filas y cols
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrizSumaFilas[i] += matriz[i][j];
				matrizSumaCols[j] += matriz[i][j];

			}

		}

		// Imprimir

		System.out.println("La suma de las filas es: ");
		for (int i = 0; i < n; i++) {

			System.out.println(matrizSumaFilas[i] + " - ");

		}

		System.out.println("La suma de las columnas es: ");
		for (int i = 0; i < m; i++) {
			System.out.println(matrizSumaCols[i] + " - ");
		}

	}

}
