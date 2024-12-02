package resolucaoExercicios021224;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Variáveis 
		
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		//Construindo o Leia
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Dados
		
		System.out.println ("Insira o valor primeiro número:");
		n1 = leia.nextFloat();
		System.out.println ("Insira o valor segundo número:");
		n2 = leia.nextFloat();
		System.out.println ("Insira o valor terceiro número:");
		n3 = leia.nextFloat();
		System.out.println ("Insira o valor quarto número:");
		n4 = leia.nextFloat();
				
		//Processamento
		
		diferenca = (n1*n2)-(n3*n4);
		
		//Saída de Dados
		
		System.out.printf("O valor da diferença entre os números é igual a " + diferenca);

	}

}
