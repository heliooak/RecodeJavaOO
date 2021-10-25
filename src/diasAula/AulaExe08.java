package diasAula;

import java.util.Scanner;
import java.text.DecimalFormat;

	public class AulaExe08 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int i=0;
			int[] a = new int[2];
			int tam = a.length;
			int[] b = new int[tam];
			System.out.println("Elementos no vetor A: [2] ");
			for(i=0;i<tam;i++) {
				System.out.println("Informe o "+(i+1)+"º elemento: ");
				a[i]=in.nextInt();
				b[i]=(a[i]*a[i]);
			}
			in.close();
			System.out.println("\n------Vetor A-------");
			for(i=0;i<tam;i++) {
				System.out.print("-"+a[i]);
			}
			System.out.println("\n------Vetor B-------");
			for(i=0;i<tam;i++) {
				System.out.print("-"+b[i]);
				
			}
			
			DecimalFormat df = new DecimalFormat("###,###,###");
			
			System.out.println("\n--B é Raiz quadrada de A-------");
			for(i=0;i<tam;i++) {
				System.out.print(df.format(Math.sqrt(a[i]))+" ");
			}	
		}
	}

