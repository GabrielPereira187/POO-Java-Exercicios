import java.util.Scanner;

import fatec.poo.model.Hotel;

public class Aplic {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op,numQuarto,rg,dias;
		double valDiaria;
		
		
		System.out.println("Entre com o numero do quarto:");
		numQuarto = entrada.nextInt();
		System.out.println("Entre com o valor da diária:");
		valDiaria = entrada.nextDouble();
		
		Hotel h = new Hotel(numQuarto,valDiaria);
		
		while(true) {
			System.out.println("1 – Consultar quarto\r\n"
					+ " 2 – Reservar quarto\r\n"
					+ " 3 – Liberar Quarto\r\n"
					+ " 4 – Consultar Faturamento Quarto\r\n"
					+ " 5 – Sair\r\n"
					+ " Digite a opção: ");
			op = entrada.nextInt();
			switch(op) {
			case 1:
				if(h.isSituacao() == true) {
					System.out.println("O quarto está ocupado");
				}
				else {
					System.out.println("O quarto está livre");
				}
				break;
			case 2:
				System.out.println("Digite o RG do hóspede:");
				rg = entrada.nextInt();
				h.reservar(rg);
				break;
			case 3:
				System.out.println("Digite o número de dias:");
				dias = entrada.nextInt();
				h.liberar(dias);
				break;
			case 4:
				System.out.println("O total faturado até o momento é:" + h.getTotalFaturado());
				break;
			case 5:
				System.exit(0);
				break;
		}


	}
		
	}

}
