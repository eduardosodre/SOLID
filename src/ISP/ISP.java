package ISP;

public class ISP {

	/**
	 * 
	 * O problema é implementar interfaces que não utilizam todos os métodos assinados
	 * 
	 * ou seja a Idéia é dividir as interfaces para utilizar somente as Interfaces corretas
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
