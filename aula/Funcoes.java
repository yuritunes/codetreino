package aula;
/*
 * Classe que exemplifica fun��es.
 * 
 * vers�o 1.0
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
		//Operador tern�rio.
		//String resultado = nota >=7?"Voc� foi aprovado":"Voc� ficou de recupera��o";
		String resultado = 19>6? "verdadeiro":"falso";
		System.out.println(resultado);
				
	}
    //com retorno do tipo int e recebe dois par�metros.  
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


