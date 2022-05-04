
public class Main {

	public static void main(String[] args) {
		
		
		Monitor monitor = new Monitor();
		Conta conta1 = new Conta(1000);
		
		monitor.setY(conta1.getSaldo());
		
		monitor.setValor(500);
		monitor.saque();
		
		monitor.setValor(300);
		monitor.saque();
		monitor.saque();
		monitor.deposito();
						
		monitor.setValor(250);
		monitor.deposito();
		
		
	}
	

}
