
public class Monitor {
	private float y;
	private float valor;	
	
	
	public synchronized float getY() {
		return y;
	}

	public synchronized void setY(float y) {
		this.y = y;
	}

	public synchronized float getValor() {
		return valor;
	}

	public synchronized void setValor(float valor) {
		this.valor = valor;
	}


	public synchronized void saque(){
		float x = getY();
			if (valor < 0 ) {
				System.out.println("Quantia não pode ser negativa");
			}else if (x < valor) {
				System.out.println("saldo insuficiente");
			}else {
				x = x - valor;
				setY(x);
				System.out.println("seu saldo agora é: " + x);
			}	
		}
	
	public synchronized void deposito() {
		float x = getY();
		if (valor < 0) {
			System.out.println("Quantia não pode ser negativa");
		}else {
			x = x + valor;
			setY(x);
			System.out.println("seu saldo agora é: " + x);
		}
		
	}
	

	
	
}
