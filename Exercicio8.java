package Lista9;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float areatotal;
		
		
		
		System.out.println("Digite o nome do comodo :");
		String nome = sc.next();
	
		System.out.println("Digite a largura do comodo : ");
		Float largura = sc.nextFloat();
		
		System.out.println("Digite o comprimento : ");
		Float comprimento = sc.nextFloat();
		
		Float area = largura * comprimento;
		System.out.println("A area do(a) "+nome+" é  igual a "+area);
	
		 areatotal =+ area;
		
		System.out.println("Deseja continuar calculando ? ");
		String continuar = sc.next();
	
		while (continuar != "Sim" && continuar !="sim") {
			System.out.println("Digite o nome de outro comodo : ");
			nome=sc.next();
			
			System.out.println("Digite a largura do comodo : ");
			 largura = sc.nextFloat();
			
			System.out.println("Digite o comprimento : ");
			 comprimento = sc.nextFloat();
		
			 area = largura * comprimento;
				System.out.println("A area do(a) "+nome+" é  igual a "+area);
			 
			 
			 System.out.println("Deseja continuar calculando ? ");
			 continuar = sc.next();
			 
		break;
		}
		
		while (continuar != "Nao" && continuar !="nao") {
			System.out.println("A area total do imovel é de : "+areatotal+ " Metros Quadrados.");
			break;
		}
		
		
		
		sc.close();
	}

}
