package diasAula;

public class AulaExe06 {

	public static void main(String[] args) {
		
		double TempD1 = 31.3;
		double TempD2 = 31.3;
		double TempD3 = 31.3;
		double TempD4 = 31.3;
		double TempD5 = 31.3;
		
		
		double[] temperaturas = new double[5];
		temperaturas[0] = 31.3;
		temperaturas[1] = 35.3;
		temperaturas[2] = 30;
		temperaturas[3] = 33;
		temperaturas[4] = 29.6;
		
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
	}
}
