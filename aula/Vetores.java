package aula;

import java.util.ArrayList;

/*
 *  Classe que especifica a cria��o e manipula��o de arrays
 *  
 *  vers�o 1.0
 *  
 *  autor: Yuri
 *  
 */
public class Vetores {

	public static void main(String[] args) {
		
		//Declara��o de um vetor vazio.
		int numeros[] = new int [5];
		
		numeros [0]=10;
		numeros [1]=20;
		numeros [2]=30;
		numeros [3]=40;
		numeros [4]=50;
		
		System.out.println(numeros[2]);
		
		char consoantes[]= {'b','c','d','f','g'};
		
		System.out.println(consoantes[4]);
		
		ArrayList<Integer> pares = new ArrayList <>();
		
		pares.add(2);
		pares.add(6);
		pares.add(1, 4);
		pares.add(24);
		pares.add(10);
		pares.add(8);
		pares.sort(null);
		pares.remove(4);
		
		System.out.println(pares.get(4));
		
		

	}

}
