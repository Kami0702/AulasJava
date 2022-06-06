
public class Aplicacao {

	public static void main(String[] args) {
        
        Rota rota = new Rota();
		
		
 //Automovel automovel = new Ferrari ();
 //rota.ir(automovel);
 //automovel = new Fusca();
 //rota.ir(automovel);	
		
		Automovel automovel = new Ferrari();
		rota.ir(automovel);
		automovel = new Fusca();
		rota.ir(automovel);
	
Vendedor vendedor = new Vendedor();
Apartamento apartamento = new Apartamento();
 
 
 Vendedor.mostraPreco(apartamento);
 Vendedor.mostraPreco(ferrari);
 
}
 
tarefa para aprender a tilizar inface
