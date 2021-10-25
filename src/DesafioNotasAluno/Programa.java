package DesafioNotasAluno;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Aluno a1 = new Aluno();

		a1.setNome("Hélio");
		a1.setCurso("Recode");
		a1.setMatricula(213);

		System.out.println(a1.getNome());
		System.out.println(a1.getCurso());
		System.out.println(a1.getMatricula());

		a1.addNotasEDiciplinas();
		a1.resultado();

		input.close();
		
	}
}
