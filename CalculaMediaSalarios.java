package fundamentos;

import java.util.Scanner;  //importa a clase scanner do Java

public class CalculaMediaSalarios 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);  //chama o método scanner
				
		
		System.out.print("Calcula média salarial - Digite o primeiro valor: ");
		String salario01 = entrada.next().replace(",", ".");  //solicita a entrada e já converte a vírgula para ponto
		
		System.out.print("Calcula média salarial - Digite o segundo valor: ");
		String salario02 = entrada.next().replace(",", ".");

		System.out.print("Calcula média salarial - Digite o terceiro valor: ");
		String salario03 = entrada.next().replace(",", ".");
		
		
		double valor01 = Double.parseDouble(salario01);
		double valor02 = Double.parseDouble(salario02);
		double valor03 = Double.parseDouble(salario03);
		
		
		double soma = valor01 + valor02 + valor03;
		System.out.println("A soma dos salários no período é: " + soma);
		System.out.println("A média do período é: " + soma / 3);

		entrada.close();  //fecha a entrada pelo scanner.
	
	}
}
