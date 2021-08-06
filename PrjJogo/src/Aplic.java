import java.util.Scanner;

import fatec.poo.model.GameShop;

public class Aplic {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade,cod,op;
		double horas;
		System.out.println("Digite a idade:");
		idade = entrada.nextInt();
		System.out.println("Digite o código");
		cod = entrada.nextInt();
		
		
		
		GameShop gs = new GameShop(cod,idade);
		
		while(true) {
			System.out.println("\n\n1 – Comprar Horas\r\n"
					+ "2 – Jogar\r\n"
					+ "3 – Brinde\r\n"
					+ "4 – Consultar Saldo de Horas\r\n"
					+ "5 – Sair\r\n\n"
					+ "\nIdade:" + gs.getIdade()
					+ "\nCódigo:"+ gs.getCod()
					+ "\n\n\nDigite a opção:");
			op = entrada.nextInt();
			System.out.println("\n\n");
			switch(op) {
			case 1:
				System.out.println("Números de horas a serem compradas:");
				horas = entrada.nextDouble();
				gs.comprar(horas);
				break;
			case 2:
				System.out.println("Números de horas a serem jogadas:");
				horas = entrada.nextDouble();
				if(horas > gs.getQtdHoras()) {
					System.out.println("Número de horas insuficiente para jogar");
				}
				else {
						gs.jogar(horas);}
				break;
			case 3:
				System.out.println("Suas horas foram dobradas!!!");
				gs.brinde();
				break;
			case 4:
				System.out.println("Número de horas disponíveis:" + gs.getQtdHoras());
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}

}
