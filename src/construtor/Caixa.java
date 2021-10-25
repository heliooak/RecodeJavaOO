package construtor;

public class Caixa {
	public double saldo = 0;
	public Caixa(double x) {
		this.saldo = x;
	}
	public Caixa() {
		
	}
	void sacar(double x) {
		this.saldo = saldo - x;
	}
	void depositar(double x) {
		this.saldo = saldo + x;
	}
	double exibirSaldo() {
		return this.saldo;
	}
}
