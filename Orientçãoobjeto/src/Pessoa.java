
public class Pessoa {

		String nome;
		int numFig;
		
		
		void receber(int numFig) {
			this.numFig += numFig;
			
		}
		
		boolean dar(int numFig, Pessoa pessoa) {
			boolean msg;
			
			if(this.numFig < numFig){
			System.out.println("Voc� n�o possui essa quantidade de figurinhas para poder dar.");
			msg = false;
			//return false;
			}else {
				this.numFig -= numFig;
				pessoa.receber(numFig);
				msg = true;
				//return true;
				// � umas formas de fazer o retorno
		}
				
			return msg;
			
		}
}
