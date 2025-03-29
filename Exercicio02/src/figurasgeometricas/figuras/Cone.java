package figurasgeometricas.figuras;

import figurasgeometricas.excecoes.ConeInvalidoException;
import figurasgeometricas.interfaces.FiguraEspacial;

public class Cone extends Figura implements FiguraEspacial{
	
	private double raio;
	private double altura;
	
	public Cone(double raio, double altura) throws ConeInvalidoException {
		if(raio>0 && altura>0) {
			this.raio = raio;
			this.altura = altura;
		}else {
			throw new ConeInvalidoException();
		}
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return (Math.PI*Math.pow(raio, 2)*altura)/3;
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.printf("Volume do Cone: %.2f\n", calcularVolume());
	}

}