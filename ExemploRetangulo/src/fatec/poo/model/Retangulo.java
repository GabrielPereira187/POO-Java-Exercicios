package fatec.poo.model;

public class Retangulo {
	private double altura;
	private double base;
	
	public void setBase(double b) {
		base = b;
	}
	public void setAltura(double h) {
		altura = h;
	}
	public double calcperimetro() {
		return ((altura + base) * 2);
	}
	public double calcarea() {
		return (altura * base);
	}
	public double getAltura() {
		return this.altura = altura;
	}
	public double getBase() {
		return this.base = base;
	}
	public double calcDiagonal() {
		double hip = Math.pow(altura, 2) + Math.pow(base, 2);
		hip = Math.sqrt(hip);
		return hip;
	}
}
