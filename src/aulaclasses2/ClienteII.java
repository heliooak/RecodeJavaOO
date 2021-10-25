package aulaclasses2;

public class ClienteII {
	String nome;
	String telefone;
	public ClienteII(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public ClienteII() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
