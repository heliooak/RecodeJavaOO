package aulaclasses2;

public class Interfaces {
	
	interface Conta{
		void deposita(double valor);
		void saca(double valor);
	}
	
	class ContaPoupanca implements Conta{
		public void deposita() {
			this.saldo = this.saldo + valor;
		}
		public void saca(double valor) {
			this.saldo = this.saldo - valor;
		}
	}
}

