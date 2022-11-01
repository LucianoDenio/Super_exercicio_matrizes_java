package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int n = sc.nextInt();
		while(n>10) {
			System.out.print("Por favor digite um número menor que 10 :");
			n =sc.nextInt();
		}
		
		double [][] mat = new double [n][n];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				System.out.print("Elemento ["+(i)+","+(j)+"]:");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("SOMA DOS POSITIVOS: ");
		
		double positive = 0.0;
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if(mat[i][j]>0) {
					positive += mat[i][j];
				}
			}
		}
		
		System.out.printf("%.1f%n",positive);
		System.out.println();
		
		System.out.print("Escolha uma linha: ");
		int line = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for(int i=0;i<mat.length;i++) {
			System.out.printf("%.2f ",mat[line][i]);
		}
		System.out.println();
		System.out.println();
		
		System.out.print("Escolha uma coluna: ");
		int column = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for(int i=0;i<mat.length;i++) {
			System.out.printf("%.2f ",mat[i][column]);
		}
		System.out.println();
		
		
		
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL:");
		for (int i=0;i<mat.length;i++) {
			System.out.printf("%.2f ",mat[i][i]);
		}
		System.out.println();
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if(mat[i][j]<0) {
					mat[i][j] = mat[i][j] * mat[i][j];
				}
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ ALTERADA");
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				System.out.printf("%.2f ",mat[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
