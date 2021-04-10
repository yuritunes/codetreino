package aula;
/*
 * Classe de explicação e demonstração dos operadores
 * 
 * versão: 1.0
 * 
 * autor: Yuri
 * 
 */
public class Operadores {

	public static void main(String[] args) {
		
		int numero1=10,numero2=8;
		
		
		//Operadores aritmeticos + - * / %
		
		int resultado1 = numero1 + numero2;
		
		System.out.println(resultado1);
		
		int resultado2 = numero1 - numero2;
				
		System.out.println(resultado2);
		
		int resultado3 = numero1 * numero2;
		
		System.out.println(resultado3);
		
		double resultado4 = (double)numero1 / numero2;
		
		System.out.println(resultado4);
		
		int resultado5 = numero1 % resultado2;
		
		System.out.println(resultado5);
		
		
		
		//numero = numero1 + 1;
		
		System.out.println(numero1++);
		System.out.println(++numero1);
		
		//exemplo: numero1+=10  numero1*=10
		
		
		// operadores de relacionamento
		
		System.out.println(numero1 > numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 <= numero2);
		
		
		//operadores logicos && ||
		
		System.out.println("falso e falso: "+(false&&false));
		System.out.println("falso e verdadeiro: "+(false&&true));
		System.out.println("verdadeiro e falso: "+(true&&false));
		System.out.println("verdadeiro e verdadeiro: "+(true&&true));
		
		System.out.println("falso ou falso: "+(false||false));
		System.out.println("falso ou verdadeiro: "+(false||true));
		System.out.println("verdadeiro ou falso: "+(true||false));
		System.out.println("verdadeiro ou verdadeiro: "+(true||true));
		
	}

}
