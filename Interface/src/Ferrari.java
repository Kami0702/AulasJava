
public class Ferrari implements Automovel, ItemCaro{
	
	
	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a Direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	public void virarEsquerda() {
		System.out.println("Ferrari virou a Esquerda");
		
		
	}
	
	public double getPreco() {
		return 5000000;
		
		
		
	}
	

}
