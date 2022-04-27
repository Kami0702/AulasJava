
public class ContaBancaria {
 
	private int numConta;
	private boolean ativo;
	private double saldo; 
			
	}
	
	public ContaBancaria(int numConta, boolean ativo, double saldo) {
		this.numConta = numConta;
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
}
	
  public void receber(double valor) {
	  saldo += valor;
	
}
	public void saldo() {
	return saldo;
	
	}
	
	public void dar(double valor) {
	if(saldo>= valor)
	saldo -= valor;
	
	}	
	
		
		
	
}