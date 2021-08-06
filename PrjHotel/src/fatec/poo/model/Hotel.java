package fatec.poo.model;

public class Hotel {
	private int numQuarto;
	private int numRG;
	private double valDiaria;
	private double totalFaturado = 0;
	private boolean situacao;
	public double getTotalFaturado() {
		return totalFaturado;
	}
	public void setTotalFaturado(double totalFaturado) {
		this.totalFaturado = totalFaturado;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Hotel(int numQuarto, double valDiaria) {
		super();
		this.setNumQuarto(numQuarto);
		this.valDiaria = valDiaria;
		situacao = false;
	}
	
	
	public void reservar(int RG) {
		situacao = true;
	}
	
	public double liberar(int dias) {
		situacao = false;
		double total = dias * valDiaria;
		totalFaturado += total;
		return total;
		
	}
	public int getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	public int getNumRG() {
		return numRG;
	}
	public void setNumRG(int numRG) {
		this.numRG = numRG;
	}
}
