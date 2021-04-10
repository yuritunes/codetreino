package cursoJava.orientacaoObjeto;

public class testeFuncionario {

	public static void main(String[] args) {
		
		FuncionarioOperacional f1 = new FuncionarioOperacional(1112, "João", "auxiliar admin", 2000.0,"vendas");
		
		FuncionarioOperacional f2 = new FuncionarioOperacional(1112, "João", "auxiliar admin", 2000.0,"vendas");
		
		System.out.println(f1.getCadastro());
		System.out.println(f1.getOcupacao());
		System.out.println(f1.getSalario());
		System.out.println(f1.getNome());
		System.out.println(f1.getSetor());
		System.out.println(f2.fgts());
		System.out.println(f2.auxilioCreche());
		System.out.println(f2.auxilioViajem());
		System.out.println(f2.valeTransporte());
		System.out.println(f2.valeAlimentacao());
		System.out.println(f2.participacaoLucro());
		
		
		
		Funcionario.verFuncionarios();
		FuncionarioOperacional.verFuncionarios();
		
		
	}

}
