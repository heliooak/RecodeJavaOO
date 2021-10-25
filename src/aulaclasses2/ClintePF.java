package aulaclasses2;

public class ClintePF extends ClienteII {
//A palavra reservada extends indica que a classe ClientePF
//vai herdar tudo que a classe ClienteII tiver disponível para a 
//Herança (atributos e métodos se houver).
	String rg;
	String cpf;
	
	public ClientePF() {
		super();
	}
// Método construtor da classe chamando o constrututor da classe
// mãe, responsável por contribuir o objeto da classe na memória
	
	public ClientePF(String nome, String telefone, String rg, String cpf) {
		super(nome, telefone);
		this.rg = rg;
		this.cpf = cpf;
	}
	// Método construtor da classe chamando o construtor da classe
	// mãe, e recebendo seus próprios atributos por parâmetros.
	
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
