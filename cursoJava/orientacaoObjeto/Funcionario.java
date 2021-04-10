package cursoJava.orientacaoObjeto;

public abstract class Funcionario {

	private long cadastro;
	private String nome;
	private String ocupacao;
	private double Salario;
	private static int numFuncionarios;
	
	public Funcionario() {
		this.numFuncionarios++;
	}
	
	public Funcionario(long cadastro, String nome, String ocupacao, double Salario) {
		
		this.cadastro = cadastro;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.Salario = Salario;
		this.numFuncionarios++;
		
		
		
	}
	
	public long getCadastro() {
		return this.cadastro;
		
	}
	
	public void setCadastro(Long cadastro) {
		this.cadastro = cadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double Salario) {
		this.Salario = Salario;
	}
	
	public static void verFuncionarios() {
		System.out.println(numFuncionarios);
	}
}
