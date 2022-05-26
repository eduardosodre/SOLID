package ISP;

public class ISP {

	/**
	 * 
	 * O problema � implementar interfaces que n�o utilizam todos os m�todos assinados
	 * 
	 * ou seja a Id�ia � dividir as interfaces para utilizar somente as Interfaces corretas
	 * 
	 */
	public static void main(String[] args) {
		
	}
	
	interface Filme {
		public void play();
	}
	
	interface ControleAudio {
		public void controlarVolume();
	}
	
	class ReiLeao implements Filme, ControleAudio {

		@Override
		public void controlarVolume() {
			
		}

		@Override
		public void play() {
			
		}
	}
	
	class TemposModernos implements Filme {
		@Override
		public void play() {
			
		}
		
	}
}
