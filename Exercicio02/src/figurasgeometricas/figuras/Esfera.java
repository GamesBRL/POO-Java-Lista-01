package figurasgeometricas.figuras;

import figurasgeometricas.excecoes.RaioInvalidoException;
import figurasgeometricas.interfaces.FiguraEspacial;

public class Esfera extends Figura implements FiguraEspacial{
	
	private double raio;

	public Esfera(double raio) throws RaioInvalidoException{
		if(raio > 0) {
			this.raio = raio;
		}else {
			throw new RaioInvalidoException();
		}
	}
	
	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return (4*Math.PI*Math.pow(raio, 3))/3;
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.printf("Volume da Esfera: %.2f\n", calcularVolume());
	}

}
