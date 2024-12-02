package resolucaoExercicios021224;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Variaveis
		
		float salario;
		float abono;
		float novoSalario;
		
		//Construindo o Leia
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada
		
		System.out.println ("Insira o valor do Salário:");
		salario = leia.nextFloat();
		
		System.out.println ("Insira o valor do Abono:");
		abono = leia.nextFloat();
		
		//Processamento 
		
		novoSalario = salario + abono;
		
		//Saida
		
		System.out.printf("O valor do Novo Salário é de %.2f", novoSalario);
		
		

	}

}
