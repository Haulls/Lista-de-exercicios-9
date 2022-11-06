package Lista9;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		int quantidade = 0;
		
		System.out.println("Digite um numero : ");
		numero=sc.nextInt();
		
		while (numero > 0) {
			soma+=numero;
			quantidade++;
			System.out.println("Digite um numero : ");
			numero=sc.nextInt();
			
		}
		System.out.println(" A soma total é "+soma+ ", a quantidade de numeros são "+quantidade+", ja a média dos números é de "+soma/quantidade);
		
		sc.close();
	}

}
