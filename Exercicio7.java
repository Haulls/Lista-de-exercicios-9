package Lista9;

public class Exercicio7 {

	public static void main(String[] args) {
		int contadora = 1;
		int fatorial;
			
		while (contadora <= 10) {
			
			 fatorial = 1;
			int contfatorial =1;
			while(contfatorial <=contadora) {
				fatorial = fatorial * contfatorial;
				contfatorial = contfatorial + 1;
				
			}
			System.out.println("O fatorial de "+contadora+ " é "+fatorial);
			contadora = contadora + 2;
		}
	}

}
