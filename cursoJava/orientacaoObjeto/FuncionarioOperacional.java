package cursoJava.orientacaoObjeto;

public class FuncionarioOperacional extends Funcionario implements Gratificacao, Descontos{

	private String setor;
	
	public FuncionarioOperacional() {
		super();
	}
	
	public FuncionarioOperacional(long cadastro, String nome, String ocupacao, double Salario, String setor) {
		
		super(cadastro, nome, ocupacao, Salario);
		
		this.setor = setor;
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public double participacaoLucro() {
		return this.getSalario() * 1.5;
	}

	@Override
	public double auxilioCreche() {
		return 200.0;
	}

	@Override
	public double auxilioViajem() {
		return 0;
	}

	@Override
	public double fgts() {
		
		return this.getSalario() * 0.09;
	}

	@Override
	public double valeAlimentacao() {
		
		return this.getSalario() * 0.05;
	}

	@Override
	public double valeTransporte() {
		
		return this.getSalario() * 0.06;
	}
}
