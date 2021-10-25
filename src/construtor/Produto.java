package construtor;

public class Produto {
	String nome;
	String marca;
	float valor;
	
	//construtores
	Produto(){
		
	}
	
	Produto(String x){
		this.nome = x;
	}
	
	Produto(String x, String y){
		this.nome = x;
		this.marca = y;
	}
	
	Produto(String x, String y, float z){
		this.nome = x;
		this.marca = y;
		this.valor = z;
	}
}
