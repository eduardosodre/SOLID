package OCP.formaCorreta;

public class OCP {
	
	/****
	 * 
	 *  Todas as vezes que precisar acrescentar um novo Tipo, cria-se uma classe implementando suas fun��es corretas
	 *  e n�o precisa sair encontrando as classes que utilizam a classe principal
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Video v = new TVShow();
		v.calculaInteresse();
	}
}
