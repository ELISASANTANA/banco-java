
public class ContaEspecial extends Conta {
	
	// final => constante
	private final String atendimento = "Com prioridade";
	public double chequeEspecial;
	
	public ContaEspecial(String titular, int numero, double saldo, double chequeEspecial) {
		super(titular, numero, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}



	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}



	public String getAtendimento() {
		return atendimento;
	}


	public void dados() {
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());
		System.out.println("Limite cheque especial: " + this.getChequeEspecial());
	}
	
	public void sacar(double valor) {
		System.out.println("--------------" + this.getTitular() + "---------------");
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Seu novo saldo: " + this.getSaldo());
		} else if((this.getSaldo() + this.getChequeEspecial()) >= valor) {
			System.out.println("Seu saldo é insuficiente, você descontará do seu limite especial");
			this.chequeEspecial -= (valor - this.getSaldo());
			this.saldo -= valor;
			System.out.println("Saque realizado. Novo saldo: " + this.getSaldo() + ". Seu limite: " + this.getChequeEspecial());
		} else {
			System.out.println("Voce nao tem saldo nem limite para realizar o saque");
		}
	}
	
	// se o saldo tiver positivo ok, mas se tiver negativo primeiro tem que suprir a o cheque especial
	
	public void depositar(double valor) {
		System.out.println("--------------" + this.getTitular() + "---------------");
		// o saldo e o valor depositados nao sao suficientes para suprir a divida
		if(this.getSaldo() + valor <= 0) {
			this.setChequeEspecial((valor + this.getChequeEspecial()));
			System.out.println("Novo valor do eu cheque especial: R$" + this.getChequeEspecial());
			// saldo negativado mas o deposito vai suprir o cheque especial
		} else if(this.getSaldo() <= 0){
			this.setChequeEspecial(this.getChequeEspecial() - this.getSaldo());
			System.out.println("Valor cheque especial atual:" + this.getChequeEspecial());
		}
		this.setSaldo((this.getSaldo() + valor));
		System.out.println("Saldo atual: " +this.getSaldo());
	}
	
	// outra subclasse (conta poupança) metodo gerar rendimento
	
	
	
	
}
