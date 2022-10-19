
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		Cliente fulano = null;
		fulano.setNome("Fulano");
		
		Conta cc = new ContaCorrente(fulano);
		Conta poupanca = new ContaPoupanca(fulano);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
