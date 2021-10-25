package atividades_seção10;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double altura_media = soma / n;
		
		System.out.printf("Altura Média: %.2f%n", altura_media);
		
		sc.close(); 

	}

}
