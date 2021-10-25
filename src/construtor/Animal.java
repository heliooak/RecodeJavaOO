package construtor;

public class Animal {
	private String nome;
	private String cor;
	
	public Animal(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	public void mostrar() {
		System.out.println(this.nome+" "+this.cor);
	}
}
