package DesafioNotasAluno;

import java.util.Scanner;

//Escreva uma class para representar um aluno,
//adicione atributos relacionados as características de um aluno
//como nome de 3 disciplinas que esta cursando e as notas dessas
//3 disciplinas. Deenvolva um metodo para verificar se o aluno
//esta aprovado (nota maior que 7) em uma determinada disciplina.
//Escreva um programa para testar essa classe, que pede as infor-
//mações do aluno ao usuário e ao final informar o nome das dis-
//ciplinas, mostra as notas e mostra se o aluno foi aprovado ou
//não

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double[] notas = new double[3];
	
	public void addNotasEDiciplinas() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<disciplinas.length;i++) {
			System.out.println("Digite o nome da disciplina: ");
			this.disciplinas[i] = sc.next();
			System.out.println("Digite a nota da disciplina: ");
			this.notas[i] = sc.nextDouble();
		}
		sc.close();
	}
	
	public void resultado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Curso: "+this.curso);
		for(int i = 0;i<notas.length;i++) {
			System.out.println("Disciplina: "+this.disciplinas[i]);
			if(this.notas[i]>=7) {
				System.out.println("Aprovado, Nota: "+this.notas[i]);
			}else {
				System.out.println("Reprovado, Nota: "+this.notas[i]);
			}
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso=curso;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}
