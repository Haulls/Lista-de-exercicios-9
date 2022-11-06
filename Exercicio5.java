package Lista9;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int fatorial = 1;
		int i = 1;
		
		System.out.println("Digite um número para calcular o fatorial :");
		numero = sc.nextInt();
		
		while (i<=numero) {
			fatorial = fatorial * i;
			i++;
		}
	
		System.out.println("O fatorial de "+numero+ " é "+fatorial);
	
	}
	}
	
		
		
		
		
		
		
		
		
	


