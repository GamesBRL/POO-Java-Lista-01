package figurasgeometricas.excecoes;

public class CuboInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CuboInvalidoException() {
		super("O valor das arestas devem ser MAIOR que 0!!");
	}
	
}
