import java.util.Scanner;

import fatec.poo.model.Retangulo;

public class Aplic {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Retangulo Ret = new Retangulo();
		int op;
		double medalt,medper;
		while(true) {
			System.out.println("Digite sua op��o 1-Perimetro 2-Area 3-Sair");
			op = entrada.nextInt();
			if(op == 3) {
				System.out.println("Terminando execu��o");
				break;
			}
			System.out.println("Digite a altura:");
			medalt = entrada.nextDouble();
			System.out.println("Digite a base:");
			medper = entrada.nextDouble();
			Ret.setAltura(medalt);
			Ret.setBase(medper);
			System.out.println("Medida da altura " + Ret.getAltura());
			System.out.println("Medida da base " + Ret.getBase());
			
			if(op == 1) {
				double valper = Ret.calcperimetro();
				System.out.println("O valor do perimetro �: " + valper);
			}
			if(op == 2){
				double valarea = Ret.calcarea();
				System.out.println("O valor da area �: " + valarea);
			}
			System.out.println("Valor da diagonal � " + Ret.calcDiagonal());
		}

		entrada.close();


	}

}
