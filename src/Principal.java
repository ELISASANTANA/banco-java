
public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("José Antônio", 795456, 300.50);
		Conta c2 = new Conta("Luciana Almeida", 568543, 200);
		
		c1.dados();
		c2.dados();
		
		ContaCorrente c3 = new ContaCorrente("Elisa", 795456, 300.50);
		
		c3.dados();
		
		c3.sacar(300);
		c3.depositar(30000);
		
		ContaEspecial c4 = new ContaEspecial("Cainho", 10023, 200, 400);
		
//		c4.dados();
		
		c4.sacar(600);
		c4.depositar(500);
		
		ContaPoupanca c5 = new ContaPoupanca("Elisa", 795456, 300, 0.2);
		
		c5.dados();
		c5.depositar(100);
		c5.sacar(200);
		c5.rendimento();
		
	}

}
