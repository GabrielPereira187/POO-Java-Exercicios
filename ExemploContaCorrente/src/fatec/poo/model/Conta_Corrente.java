package fatec.poo.model;

public class Conta_Corrente {
	private int numeroConta;
	private double saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta_Corrente(int numC,double s) {
		saldo = s;
		numeroConta = numC;
	}
	public double adicionarSaldo(double sal) {
		saldo = sal + saldo;
		return saldo;
	}
	public double sacar(double sal) {
		if(sal > saldo) {
			return 0;
		}
		saldo = saldo - sal;
		return saldo;
	}
	

}
