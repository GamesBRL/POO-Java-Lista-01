package concessionaria.excecoes;

public class DescontoInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DescontoInvalidoException() {
		super("Desconto inválido!!");
	}

}
