package aulaclasses2;

import java.util.Date;

public class Pedido {
	private Date data;
	private String status;
	private Cliente cliente;
// Atributo do tipo cliente, a classe cliente comp�e a classe pedido, esse atributo � uma c�pia da classe cliente, portanto possui todos seus atributos e m�todos.

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}

