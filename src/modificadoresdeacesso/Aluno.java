package modificadoresdeacesso;

public class Aluno {
	private String nome;
	private int idade;

	public void setNome(String x) {
		this.nome = x;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int x) {
		if(x>0 && x<130) {
			this.idade = x;
			System.out.println("Idade cadastrada");
		}else {
			System.out.println("Error! Idade inválida.");
		}
	}
}
