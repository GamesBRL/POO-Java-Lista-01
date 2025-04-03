package figurasgeometricas.figuras;

import figurasgeometricas.excecoes.RetanguloInvalidoException;
import figurasgeometricas.interfaces.FiguraPlana;

public class Retangulo extends Figura implements FiguraPlana{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) throws RetanguloInvalidoException {
		if(base!=altura && base>0 && altura>0) {
			this.base = base;
			this.altura = altura;
		}else {
			throw new RetanguloInvalidoException();
		}
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*(base+altura);
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.printf("Área do Retângulo: %.2f\n", calcularArea());
		System.out.printf("Perímetro do Retângulo: %.2f\n", calcularPerimetro());
	}

}
