
public class pessoa1 {

S
	
	void receber(int numfigurinhas) {
	this.numfigurinhas += numfigurinhas;
	
	
	boolean dar(int figurinhas, Pessoa pessoa) {
		

		if(this.numfigurinhas<numfigurinhas) { 
			System.out.println("A quantidade de figurinhas não é suficiente para realizar esse metodo");
			//*retorno = falso;
			return false;
		
		else {
			this.numfigurinhas -= numfigurinhas;
			pessoa.receber(numfigurinhas);
			return true;
}
