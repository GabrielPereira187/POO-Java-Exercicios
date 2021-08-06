import java.util.*;
public class SegundoProjeto {

	public static void main(String[] args) {
		double tabnum[] = new double[15];
		double soma = 0;
		int i;
		for(i = 0;i < 15;i++) {
			tabnum[i] = Math.random();
			soma +=tabnum[i]; 
		}
		for(i = 0;i < 15;i++) {
			System.out.println("Indice #" + (i + 1) + " = " + tabnum[i]);
		}
		System.out.println("Media = " + soma/15);
		
	}

}
