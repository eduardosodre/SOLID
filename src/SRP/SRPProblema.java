package SRP;

/***
 * 
 * 
 * Classe errada pelo fato de ter muitas responsabilidades
 * deveria ter apenas uma responsabilidade, ou representar um Bean, ou representar transações do banco de dados
 *
 */
public class SRPProblema {

	private String nome;
	private String categoria;
	private String descricao;

	public void connection() {

	}

	public void criarCategoria() {

	}

	public void criarCurso() {

	}

	public String getName() {
		return nome;
	}
}
