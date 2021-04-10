package aula;
/*
 * Classe que exemplifica funções.
 * 
 * versão 1.0
 * 
 * autor: Yuri
 * 
 */
public class Funcoes {

	public static void main(String[] args) {
		
		int result = soma(10,60);
		
		System.out.println(result);

		quadrado(7);
		
		String texto = mensagem();
		
		System.out.println(mensagem());
		
		olaMundo();
		
		int nota = 5;
		//Operador ternário.
		//String resultado = nota >=7?"Você foi aprovado":"Você ficou de recuperação";
		String resultado = 19>6? "verdadeiro":"falso";
		System.out.println(resultado);
				
	}
    //com retorno do tipo int e recebe dois parâmetros.  
	static int soma(int a, int b) {
    	  return a + b;
      }
    
	static void quadrado (int numero) {
		System.out.println(numero*numero);
	}
    
	static String mensagem() {
		return "Mensagem do sistema";
		
	}
    static void olaMundo() {
    	System.out.println("olaMundo");
    }
}


