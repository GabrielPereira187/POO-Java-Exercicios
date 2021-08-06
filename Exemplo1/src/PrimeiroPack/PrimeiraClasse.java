package PrimeiroPack;
import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double nota,total = 0;
		int c = 0;
		while(true) {
			nota = entrada.nextDouble();
			if(nota == -1) {
				break;
			}
			total+=nota;
			c++;
			System.out.println(nota);
		}
		System.out.printf("%.2f\n", total/c);
		entrada.close();


	}

}
