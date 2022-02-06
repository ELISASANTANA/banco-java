
public class ContaCorrente extends Conta {
	
	private final String atendimento = "Sem prioridade";
	
	public ContaCorrente(String titular, int numero, double saldo)	{
		// os atributos titular, numero e saldo estao vindo da superclasse
		super(titular, numero, saldo);
	}
	
	public String getAtendimento() {
		return atendimento;
	}

	public void dados() {
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());
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
	
//	o valor negativo do saldo é o quanto vc ta devendo no limite especial
	
	public void depositar(double valor) {
		System.out.println("--------------" + this.getTitular() + "---------------");
		this.saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso! Novo saldo: R$" + this.getSaldo());
	}
	
	
}
