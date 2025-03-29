package figurasgeometricas.figuras;

import figurasgeometricas.interfaces.FiguraEspacial;

public class Cone extends Figura implements FiguraEspacial{
	
	private double raio;
	private double altura;
	
	public Cone(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		
	}

}