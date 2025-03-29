package figurasgeometricas.excecoes;

public class TrianguloInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TrianguloInvalidoException() {
		super("O valor dos lados devem ser MAIOR que 0!!");
	}

}
