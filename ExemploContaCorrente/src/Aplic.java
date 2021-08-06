import java.util.Scanner;

import fatec.poo.model.Conta_Corrente;

public class Aplic {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double saldo = 0,dep;
		int num,op;
		System.out.println("Adicione um numero de conta");
		num = entrada.nextInt();
		Conta_Corrente objConta = new Conta_Corrente(num,saldo);
		while(true) {	
			System.out.println("1-Depositar\n2-Sacar\n3-Verificar Saldo\n4-Sair");
			op = entrada.nextInt();
			System.out.println("Numero da conta:" + objConta.getNumeroConta());
			switch(op) {
			case 1:
					System.out.printf("Informe valor para depósito:");
					saldo = entrada.nextDouble();
					objConta.adicionarSaldo(saldo);
					System.out.println("Valor depositado R$" + saldo);
					System.out.println("\n\n");
					break;
			case 2:
					System.out.printf("Informe valor para saque:");
					saldo = entrada.nextDouble();
					dep = objConta.sacar(saldo);
					if(dep == 0) {
						System.out.println("Valor de saque maior que o de depósito!!!!!!!!!!!!");
					}
					else {
					System.out.println("Valor sacado R$" + saldo);
					}
					System.out.println("\n\n");
					break;
			case 3:
				System.out.println("Valor na conta: R$ " + objConta.getSaldo());
				System.out.println("\n\n");
				break;
			case 4:
				System.exit(0);
			}
			
		}


	}

}
