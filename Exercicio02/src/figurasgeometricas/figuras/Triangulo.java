package figurasgeometricas.figuras;

import figurasgeometricas.excecoes.TrianguloInvalidoException;
import figurasgeometricas.interfaces.FiguraPlana;

public class Triangulo extends Figura implements FiguraPlana{
	
	private double lado1;
	private double lado2;
	private double lado3;
	private double base;
	private String classeTriangulo;
	
	public Triangulo(double lado1, double lado2, double lado3) throws TrianguloInvalidoException {
		if(lado1>0 && lado2>0 && lado3>0) {
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
			classificarTriangulo();
		}else {
			throw new TrianguloInvalidoException();
		}
	}
	
	private void classificarTriangulo() {
		if(lado1==lado2 && lado2==lado3) {
			classeTriangulo = "Equilátero";
			base = lado1;
		}
		else if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1) {
			classeTriangulo = "Escaleno";
			base = Math.max(lado1, Math.max(lado2, lado3));
		}else {
			classeTriangulo = "Isósceles";
			base = Math.min(lado1, Math.min(lado2, lado3));
		}
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		switch(classeTriangulo) {
			case "Equilátero":
				return (Math.pow(lado1, 2)*Math.sqrt(3))/4;
			case "Escaleno":
				double p = calcularPerimetro()/2;
				return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
			case "Isósceles":
				double ladoIgual = (lado1 == lado2) ? lado1 : lado3;
                double altura = Math.sqrt(Math.pow(ladoIgual, 2) - Math.pow(base / 2, 2));
                return (base * altura) / 2;
			default:
				return 0;
		}
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		switch(classeTriangulo) {
			case "Equilátero":
				return lado1*3;
			case "Escaleno":
				return lado1+lado2+lado3;
			case "Isósceles":
				return lado1+lado2+lado3;
			default:
				return 0;
		}
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.println("Triângulo tipo: " + classeTriangulo);
		System.out.printf("Área do Triângulo: %.2f\n", calcularArea());
		System.out.printf("Perímetro do Triângulo: %.2f\n", calcularPerimetro());
	}

}
