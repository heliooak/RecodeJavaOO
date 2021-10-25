package TryCatch;

public class TryCacth {
	public static void main(String[] args) {
		try{
			int[] vetor = new int[4];
			
			System.out.println("Antes da Exception!");
			vetor[5] = 10;	
			System.out.println("Esse texto não será exibido!");
			
		}catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("Exceção ao tentar acessar um índice inexistente.");
		}finally {
			System.out.println("Esse texto será exibido após a exception!");
		}
	}
}
