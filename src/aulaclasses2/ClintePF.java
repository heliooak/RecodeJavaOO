package aulaclasses2;

public class ClintePF extends ClienteII {
//A palavra reservada extends indica que a classe ClientePF
//vai herdar tudo que a classe ClienteII tiver dispon�vel para a 
//Heran�a (atributos e m�todos se houver).
	String rg;
	String cpf;
	
	public ClientePF() {
		super();
	}
// M�todo construtor da classe chamando o constrututor da classe
// m�e, respons�vel por contribuir o objeto da classe na mem�ria
	
	public ClientePF(String nome, String telefone, String rg, String cpf) {
		super(nome, telefone);
		this.rg = rg;
		this.cpf = cpf;
	}
	// M�todo construtor da classe chamando o construtor da classe
	// m�e, e recebendo seus pr�prios atributos por par�metros.
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
