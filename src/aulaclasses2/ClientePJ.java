package aulaclasses2;

public class ClientePJ extends ClienteII {
	String cnpj;
	String ie;
	
	public ClientePJ() {
		super();
	}
	
	public ClientePJ(String nome, String telefone, String cnpj, String ie) {
		super(nome, telefone);
		this.cnpj = cnpj;
		this.ie = ie;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
}
