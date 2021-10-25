package diasAula;

import java.util.Scanner;

public class aulaSwitch {
	public static void main(String[] args) {
		
		System.out.println("Informe sua altura: ");
		Scanner x = new Scanner(System.in);
		float alt = x.nextFloat();
		System.out.println("Informe seu peso: ");
		float peso = x.nextFloat();
		x.close();
		
		float imc=(peso)/(alt*alt);
		System.out.println(imc);
		
		int tipo=0;
		
		if(imc<16) {
			tipo=0;
		}else if(imc>=16 && imc<18.5) {
			tipo=1;
		}else if(imc>=18.5 && imc<25) {
			tipo=2;
		}else if(imc>=25 && imc<30) {
			tipo=3;
		}else if(imc>=30){
			tipo=4;
		}
		
		switch(tipo) {
			case 0:
				System.out.println("Muito magro");
				break;
			case 1:
				System.out.println("Magro");
				break;
			case 2:
				System.out.println("Massa Ideal");
				break;
			case 3:
				System.out.println("Sobrepeso");
				break;
			case 4:
				System.out.println("Muito Sobrepeso");
				break;
		}
	}
}
