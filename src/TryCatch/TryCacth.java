package TryCatch;

public class TryCacth {
	public static void main(String[] args) {
		try{
			int[] vetor = new int[4];
			
			System.out.println("Antes da Exception!");
			vetor[5] = 10;	
			System.out.println("Esse texto n�o ser� exibido!");
			
		}catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("Exce��o ao tentar acessar um �ndice inexistente.");
		}finally {
			System.out.println("Esse texto ser� exibido ap�s a exception!");
		}
	}
}
