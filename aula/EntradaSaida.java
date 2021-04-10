package aula;

import java.util.Scanner;

/*
* Entrada e saida
* 
* versão: 1.0
* 
* author: Yuri

*/

public class EntradaSaida {

	public static void main(String[] args) {
		// criação de variaveis
		
		
		String nome;
		int idade;
		double altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome.");
		
		nome = leitor.nextLine();
		
		System.out.println("Digite sua idade.");
		
		idade = leitor.nextInt();
		
		System.out.println("Digite sua altura.");
		
		altura = leitor.nextDouble();
				
		
		
		
		System.out.println("idade: "+idade);
		System.out.println("nome: "+nome);
		System.out.println("altura: "+altura);
		
		System.out.printf("Nome: %s \n idade: %d \n altura %.2f",nome,idade,altura);
	}
	

}
