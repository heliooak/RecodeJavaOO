package diasAula;

import java.util.Scanner;

public class AulaExe05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=0;
		int[] a = new int[5];
		int tam = a.length;
		int[] b = new int[tam];
		System.out.println("Elementos no vetor A: [5] ");
		for(i=0;i<tam;i++) {
			System.out.println("Informe o "+(i+1)+"º elemento: ");
			a[i]=input.nextInt();
			b[i]=a[i];
		}
		input.close();
		System.out.println("\n------Vetor A-------");
		for(i=0;i<tam;i++) {
			System.out.print("-"+a[i]);
		}
		System.out.println("\n------Vetor B-------");
		for(i=0;i<tam;i++) {
			System.out.print("-"+b[i]);
		}
	}
}
