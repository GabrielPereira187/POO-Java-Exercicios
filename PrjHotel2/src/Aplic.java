import java.util.Scanner;

import fatec.poo.model.Hotel;

public class Aplic {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op,numQuarto,rg,dias,quartoProcura,t = 0;
		double valDiaria,tot = 0;
		Hotel [] qMatriz = new Hotel[10];
		int i,x = 10;
		for(i = 0; i < x;i++) {
			numQuarto = 1000 + 10 * i;
			valDiaria = 200 + 5 * i;
			qMatriz[i] = new Hotel(numQuarto,valDiaria);
		}
		for(i = 0; i < x;i++) {
			System.out.println("Quarto " + (i + 1));
			System.out.println("Numero do quarto " + qMatriz[i].getNumQuarto());
			System.out.println("Valor da diaria " + qMatriz[i].getValDiaria());
			System.out.println("===================================\n");
		}
		while(true) {
			System.out.println("Digite o quarto que deseja procurar:");
			quartoProcura = entrada.nextInt();
			t = 0;
			for(i = 0; i < x;i++) {
				if(quartoProcura == qMatriz[i].getNumQuarto()) {
					t = 1;
					System.out.println(" 1 – Consultar quarto\r\n"
							+ " 2 – Reservar quarto\r\n"
							+ " 3 – Liberar Quarto\r\n"
							+ " 4 – Consultar Faturamento Quarto\r\n"
							+ " 5 - Consultar Faturamento hotel\r\n"
							+ " 6 – Sair\n\n\n\n"
							+ " Digite a opção: ");
					op = entrada.nextInt();
					switch(op) {
					case 1:
						if(qMatriz[i].isSituacao()) {
							System.out.println("O quarto está ocupado");
						}
						else {
							System.out.println("O quarto está livre");
						}
						break;
					case 2:
						if(qMatriz[i].isSituacao()) {
							System.out.println("Quarto já reservado");
							break;
						}
						
						System.out.println("Digite o RG do hóspede:");
						rg = entrada.nextInt();
						qMatriz[i].reservar(rg);
						System.out.println("Quarto reservado");
						break;
					case 3:
						if(qMatriz[i].isSituacao() == false) {
							System.out.println("Quarto já liberado");
							break;
						}
						System.out.println("Digite o número de dias:");
						dias = entrada.nextInt();
						qMatriz[i].liberar(dias);
						System.out.println("Quarto liberado");
						break;
					case 4:
						tot += qMatriz[i].getTotalFaturado();
						System.out.println("O total faturado até o momento é:" + qMatriz[i].getTotalFaturado());
						break;
					case 5:
						System.out.println("Total faturado até o momento " + tot);
						break;
					case 6:
						System.exit(0);
						break;
					}
				}
			}
			if(t == 0) {
				System.out.println("Numero de quarto não encontrado\n\n\n");
			}
		}	
	}
}

