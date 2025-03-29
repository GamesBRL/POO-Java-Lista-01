package figurasgeometricas.figuras;

import figurasgeometricas.excecoes.CuboInvalidoException;
import figurasgeometricas.interfaces.FiguraEspacial;

public class Cubo extends Figura implements FiguraEspacial{
	
	private double aresta;
	
	public Cubo(double aresta) throws CuboInvalidoException{
		if(aresta > 0) {
			this.aresta = aresta;
		}else {
			throw new CuboInvalidoException();
		}
	}
	
	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return Math.pow(aresta, 3);
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.printf("Volume do Cubo: %.2f\n", calcularVolume());
	}

}
