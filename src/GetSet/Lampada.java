package GetSet;

public class Lampada {
	public float volts;
	private boolean status;
	public String cor;
	
	public void startStatus(boolean x) {
		this.status = x;
	}
	
	public void setStatus(boolean x) {
		this.status = x; 
	} 
	public boolean getStatus() {
		return status;
	}
	
	public void checkStatus() {
		System.out.println("Você entrou na sala agora e ");
		if(this.getStatus() == true) {
			System.out.println("a lâmpada está ligada.");
		}else {
			System.out.println("a lâmpada está desligada.");
		}
	}	
}


