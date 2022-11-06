package Lista9;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quadrado=0;
		
		for (int i=15;i<200;i++){
				
				quadrado = i*i;
				
				System.out.println("O quadrado de "+i+ " é "+quadrado);
			}
		
		
		
		
		
		
		sc.close();
		
	}

}
