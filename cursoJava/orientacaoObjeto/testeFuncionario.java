package cursoJava.orientacaoObjeto;

public class testeFuncionario {

	public static void main(String[] args) {
		
		FuncionarioOperacional f1 = new FuncionarioOperacional(1112, "Jo�o", "auxiliar admin", 2000.0,"vendas");
		
		FuncionarioOperacional f2 = new FuncionarioOperacional();
		
		System.out.println(f1.getCadastro());
		System.out.println(f1.getOcupacao());
		System.out.println(f1.getSalario());
		System.out.println(f1.getNome());
		System.out.println(f1.getSetor());
		
		Funcionario.verFuncionarios();
		FuncionarioOperacional.verFuncionarios();
		
		
	}

}
