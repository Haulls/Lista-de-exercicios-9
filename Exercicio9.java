package Lista9;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Maior = 0;
		int Menor = 0;
		System.out.println("Digite um valor :");
		int numero = sc.nextInt();

		while (numero >= 0) {
			System.out.println("Digite outro valor : ");
			numero = sc.nextInt();
		
			if (numero > Maior) {
				Maior = numero;
			}
			if (numero < Menor) {
				Menor = numero;

			}
		
		}

		

		System.out.println("O maior numero é : " + Maior);

		System.out.println("O menor numero é : " + Menor);
		sc.close();

	}

}
