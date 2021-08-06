package fatec.poo.model;

public class Aluno {
	private int RA;
	private double NtProva1;
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public double getNtProva1() {
		return NtProva1;
	}
	public void setNtProva1(double ntProva1) {
		NtProva1 = ntProva1;
	}
	public double getNtProva2() {
		return NtProva2;
	}
	public void setNtProva2(double ntProva2) {
		NtProva2 = ntProva2;
	}
	public double getNtTrab1() {
		return NtTrab1;
	}
	public void setNtTrab1(double ntTrab1) {
		NtTrab1 = ntTrab1;
	}
	public double getNtTrab2() {
		return NtTrab2;
	}
	public void setNtTrab2(double ntTrab2) {
		NtTrab2 = ntTrab2;
	}
	private double NtProva2;
	private double NtTrab1;
	private double NtTrab2;
	
	public double calcMediaTrab() {
		return((0.25 * (NtTrab1 + NtTrab2)) /2);
	}
	public double calcMediaProva() {
		return((0.75 * (NtProva1 + NtProva2 * 2)) /3);
	}
	public double calcMediaFinal() {
		return(calcMediaProva() + calcMediaTrab());
	}
	public boolean isAprovado() {
		if(calcMediaFinal() >= 6) {
			return true;
		}
		else {
			return false;
		}
	}
}
