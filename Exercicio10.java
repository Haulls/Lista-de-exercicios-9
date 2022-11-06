package Lista9;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int divisor;
		int dividendo;
		int resultado = 0;
		
		System.out.println("Digite o valor do dividendo : ");
		dividendo = sc.nextInt();
		
		
		System.out.println("Digite o valor do divisor : ");
		divisor = sc.nextInt();
		
		int x = divisor;
		while (dividendo >= divisor) {
			divisor = divisor+x;
			resultado++;
		}
	System.out.println("O valor inteiro da divisão é : "+resultado);
	
	sc.close();
	
	
	
	
	
	
	}

}
