package objeto;

public class ContaBancaria {
	private String nome;
	private double saldo;
	
	public ContaBancaria() {}
	
	
	public ContaBancaria(String nome, double saldo) {
		
		setNome (nome);
		setSaldo (saldo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
	public void depositar (double valor) {
		if (valor >= 0 ) {
			 saldo += valor;
		}
	}
	
	public void sacar (double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		}
	}

}