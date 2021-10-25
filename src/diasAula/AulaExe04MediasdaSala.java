package diasAula;

import java.util.Scanner;

public class AulaExe04MediasdaSala {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] alunos = new String[5];
		float[] medias = new float[5];
		float n1,n2,med;
		// Alternativa mais eficiente para detectar as maiores e menores 
		// médias sem precisar organizar uma lista;
		
		float maiorMed,menorMed;
		maiorMed=0;
		menorMed=10;
		
		//Aqui os floats maiorMed e menorMed foram utilizados a parte com else if
		
		for(int i=0;i<5;i++) {
			System.out.println("Nome do "+(i+1)+"º aluno: ");
			alunos[i] = in.next();
			System.out.println("1ª nota: ");
			n1 = in.nextFloat();
			System.out.println("2ª nota: ");
			n2 = in.nextFloat();
			med = ((n1+n2)/2);
			medias[i] = med;
			System.out.println((med>=6)?(alunos[i]+": Aprovado"):(alunos[i]+": Reprovado"));
			
			if(med>maiorMed) {
				maiorMed=med;
			}else if(med<=menorMed) {
				menorMed=med;
			}
			
		}
		in.close();
		System.out.println("\nMaior Média usando apenas o else if: "+(maiorMed));
		System.out.println("\nMenor Média usando apenas o else if: "+(menorMed));
		int a,b;
		float x=0;
		String y;
		for(a=0;a<5;a++) {
			for(b=(a+1);b<5;b++) {
				if(medias[a]>medias[b]) {
					x=medias[a];
					medias[a]=medias[b];
					medias[b]=x;
					y=alunos[a];
					alunos[a]=alunos[b];
					alunos[b]=y;
				}
			}
		}
		float medGeral=0;
		System.out.println("\nMédia dos alunos:\n");
		for(int i=0;i<5;i++){
			System.out.println(alunos[i]+" - Média: "+ medias[i]);
			medGeral=(medGeral+medias[i]);
			if(i==4) {
				medGeral=(medGeral/5);
				System.out.println("Média da Turma: "+(medGeral));
			}
		}
		System.out.println("Média mais baixa: "+(alunos[0])+": "+(medias[0]));
		System.out.println("Média mais alta: "+(alunos[4])+": "+(medias[4]));
	}
}