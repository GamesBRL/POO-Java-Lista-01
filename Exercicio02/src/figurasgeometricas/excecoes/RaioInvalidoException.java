package figurasgeometricas.excecoes;

public class RaioInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RaioInvalidoException() {
		super("O valor do raio deve ser MAIOR que 0!!");
	}

}
