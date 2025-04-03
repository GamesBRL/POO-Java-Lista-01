package figurasgeometricas.excecoes;

public class RetanguloInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RetanguloInvalidoException() {
		super("A altura e base não podem possuir o MESMO valor e devem ser MAIOR que 0!!");
	}
	
}
