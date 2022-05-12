
public class Aplicacao {

	public static void main(String[] args) {

// Item item = new item();	
		
//Classe abstrata pode servir como super classe e as subclasses herda dela porem em si é uma classe considerada sem sentido quando utilizada de forma erronea.Em si pode fazer varias classes abostratas.
		
Item item = new Cogumelo();
item.pegar();

item = new Moeda();
item.pegar();

item = new Diamante();
item.pegar();

		

}
	
}
