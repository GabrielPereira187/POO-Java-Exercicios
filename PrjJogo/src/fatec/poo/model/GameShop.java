package fatec.poo.model;

public class GameShop {
	private int cod;
	private int idade;
	private double QtdHoras = 0;
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getQtdHoras() {
		return QtdHoras;
	}
	public void setQtdHoras(double qtdHoras) {
		QtdHoras = qtdHoras;
	}
	public GameShop(int cod, int idade) {
		super();
		this.cod = cod;
		this.idade = idade;
	}
	
	
	public void comprar(double horas) {
		QtdHoras += horas;
	}
	public void jogar(double jogo) {
		QtdHoras -= jogo;
	}
	public void brinde() {
		QtdHoras *= 2;
	}

}
