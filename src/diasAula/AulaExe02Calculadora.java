package diasAula;

import java.util.Scanner;

public class AulaExe02Calculadora {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		char resp='s';
		while(resp=='s') {
			System.out.println("Digite o primeiro n�mero: ");
			float a = x.nextFloat();
			System.out.println("Digite o segundo n�mero: ");
			float b = x.nextFloat();
			System.out.println("Escolha a opera��o: [ + - * / ]");
			char op = x.next().charAt(0);
			float r=0;
			switch(op) {
				case '+':
					r=(a+b);
					System.out.println(r);
					break;
				case '-':
					r=(a-b);
					System.out.println(r);
					break;
				case '*':
					r=(a*b);
					System.out.println(r);
					break;
				case '/':
					r=(a/b);
					System.out.println(r);
					break;
			}
			System.out.println("Deseja continuar?[s/n]");
			resp = x.next().charAt(0);	
		}x.close();
	}
}
