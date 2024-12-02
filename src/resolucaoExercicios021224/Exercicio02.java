package resolucaoExercicios021224;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Variaveis
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		//Construindo o leia
		
		Scanner leia = new Scanner(System.in); 		
		
		//Entrada de dados
		
		System.out.println("Insira a sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira a sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		//Processamento
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) /4;
				
		//Saída de dados
		
		System.out.printf("A média final das suas notas foi: %.1f", mediaFinal);

		

	}

}
