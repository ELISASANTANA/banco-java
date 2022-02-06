
//Atividade: Criar a classe para ContaPoupanca.
//Na ContaPoupanca a diferença ser um método render que acrescentaria um rendimento ao saldo.

public class ContaPoupanca extends Conta {
	
	public double rendimento;
	
	public ContaPoupanca(String titular, int numero, double saldo, double rendimento) {
		super(titular, numero, saldo);
		this.rendimento = rendimento;
	}	
	
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public void rendimento() {
		System.out.println("--------------Rendimento ao longo dos meses---------------");
		String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};
		
		for(int i=0; i < meses.length; i++) {
			this.setSaldo((this.getSaldo() * this.rendimento) + this.getSaldo());
			System.out.println("seu novo saldo com rendimento do mes de " + meses[i] + " é: R$" + this.getSaldo());
		}
	}
	
	public void dados() {
		super.dados();
		System.out.println("Rendimento mensal: " + this.getRendimento());
	}
	
	public void depositar(double valor) {
		System.out.println("--------------" + this.getTitular() + "---------------");
		this.saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso! Novo saldo: R$" + this.getSaldo());
	}
	
	
	public void sacar(double valor) {
		System.out.println("--------------" + this.getTitular() + "---------------");
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso. Seu saldo atual: " + this.getSaldo());
		} else {
			System.out.println("Seu saldo é insuficiente para o saque desejado!");
		}
	}
	
}
