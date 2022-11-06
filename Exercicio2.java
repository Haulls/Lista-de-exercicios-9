package Lista9;

public class Exercicio2 {

	public static void main(String[] args) {
		int somapares = 0;
		int i = 1;

		while (i <= 500) {
	
			i = i + 1;
			if(i%2==0) {
				somapares = somapares + i;
			}
		}
		System.out.println(" A soma dos numeros pares até 500 é de : "+somapares);
		
	}
	
}


