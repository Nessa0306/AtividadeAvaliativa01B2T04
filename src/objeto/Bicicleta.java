package objeto;

public class Bicicleta {
	private int horas;
	private double valorHora;
	
	public Bicicleta() {}
	
	public Bicicleta(int horas, double valorHora) {
		setHoras (horas);
		setValorHora (valorHora);
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		if (horas >= 1) {
			this.horas = horas;
		}
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		if (valorHora > 0) {
			this.valorHora = valorHora;
		}
	}
	
	public double calcularValor() {
		
		return horas * valorHora;
	}
	

}