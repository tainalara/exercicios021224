package resolucaoExercicios021224;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Variaveis
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		
		//Construindo o Leia
		
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Dados
		
		System.out.println ("Insira o valor do Salário Bruto R$");
		salarioBruto = leia.nextFloat();
		
		System.out.println ("Insira o valor do Adicional Noturno R$");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println ("Insira o valor das Horas Extras R$");
		horasExtras = leia.nextFloat();
		
		System.out.println ("Insira o valor dos Descontos R$");
		descontos = leia.nextFloat();
		
		//Processamento
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		//Saída de Dados
		
		System.out.printf("O valor do seu Salário Líquido é de %.2f", salarioLiquido);


	}

}
