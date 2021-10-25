package aulaclasses2;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public double calcularBonus() {
		return salario*(0.10);
	}
}

public class Gerente extends Funcionario{
	
	String setor;
	
	@Override
	public double calcularBonus() {
		return (this.salario*(0.20));
	}
}