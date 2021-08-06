import java.util.Scanner;

import fatec.poo.model.Aluno;

public class Aplic {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno objAluno = new Aluno();
		int op,ra;
		boolean sit;
		double p1,p2,t1,t2;
		System.out.println("Digite o RA do aluno");
		ra = entrada.nextInt();
		System.out.println("Digite a nota da primeira prova:");
		p1 = entrada.nextDouble();
		System.out.println("Digite a nota da segunda prova:");
		p2 = entrada.nextDouble();
		System.out.println("Digite a nota do primeiro trabalho:");
		t1 = entrada.nextDouble();
		System.out.println("Digite a nota do segundo trabalho:");
		t2 = entrada.nextDouble();
		objAluno.setNtProva1(p1);
		objAluno.setNtProva2(p2);
		objAluno.setNtTrab1(t1);
		objAluno.setNtTrab2(t2);
		objAluno.setRA(ra);
		while(true) {
			System.out.println("Digite a opçao desejada\n1-"
					+ "Mostrar notas de provas e trabalhos\n2-Media de provas e trabalhos\n3-Media Final\n4-Sair");
			op = entrada.nextInt();
			switch(op) {
			case 1:
				System.out.println("RA do aluno: " + objAluno.getRA());
			System.out.println("A nota da primeira prova foi: " + objAluno.getNtProva1() + "\nA nota da segunda prova foi: " 
			+ objAluno.getNtProva2() + "\nA nota do primeiro trabalho foi: " 
					+ objAluno.getNtTrab1() + "\nA nota do segundo trabalho foi: " + objAluno.getNtTrab2());
			break;
			case 2:
				System.out.println("RA do aluno: " + objAluno.getRA());
				System.out.println("A media das provas foi de: " + objAluno.calcMediaProva() + "\nA media dos trabalhos foi de: " + objAluno.calcMediaTrab());
			break;
			case 3:
				System.out.println("RA do aluno: " + objAluno.getRA());
				System.out.println("A media total foi de: " + objAluno.calcMediaFinal());
				sit = objAluno.isAprovado();
				if(sit == true) {
					System.out.println("Aprovado");
				}
				else {
					System.out.println("Reprovado");
				}
			break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Opção inexistente!!!");
				break;
			}
		}
	}

}
