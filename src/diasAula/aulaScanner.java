package diasAula;

import java.util.Scanner;

public class aulaScanner {

	public static void main(String[] args) {
			
		System.out.println("Digite seu Nome: ");
		Scanner x = new Scanner(System.in);
		String Nome = x.nextLine();
		System.out.println("Seu nome é : " + Nome);
		x.close();
	}
}
