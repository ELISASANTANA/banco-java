
public class Conta {
	
	public int numero;
	public String titular;
	public double saldo;
	
	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void dados() {
		System.out.println("--------------------------");
		System.out.println("Titular da conta: " + this.getTitular());
		System.out.println("Numero da conta: " + this.getNumero());
		System.out.printf("Saldo da conta: %.2f %n", this.getSaldo());
	}
	
}






