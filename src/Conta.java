
public class Conta {

	private float saldo;

	
	
	public Conta() {
	
	}

	public Conta(float saldo) {
		setSaldo(saldo);
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

	
	
}
