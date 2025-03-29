package figurasgeometricas.figuras;

import figurasgeometricas.excecoes.RaioInvalidoException;
import figurasgeometricas.interfaces.FiguraPlana;

public class Circulo extends Figura implements FiguraPlana{
	
	private double raio;
	
	public Circulo(double raio) throws RaioInvalidoException{
		if(raio > 0) {
			this.raio = raio;
		}else {
			throw new RaioInvalidoException();
		}
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(raio, 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (2*Math.PI)*raio;
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.printf("Área do Circulo: %.2f\n", calcularArea());
		System.out.printf("Circunferência do Circulo: %.2f\n", calcularPerimetro());
	}

}
