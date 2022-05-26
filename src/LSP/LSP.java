package LSP;

import OCP.formaCorreta.Movie;
import OCP.formaCorreta.TVShow;
import OCP.formaCorreta.Video;

public class LSP {

	/***
	 * 
	 * 
	 * 
	 * Liskov Substitution Principle
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Video m = new TVShow();
		if(m instanceof TVShow) {
			TVShow tv = (TVShow) m;
			tv.tv();
		}
	}
}
