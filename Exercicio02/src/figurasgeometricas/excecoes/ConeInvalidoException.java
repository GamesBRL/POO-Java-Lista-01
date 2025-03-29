package figurasgeometricas.excecoes;

public class ConeInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConeInvalidoException() {
		super("O valor do raio e altura devem ser MAIOR que 0!!");
	}
}
