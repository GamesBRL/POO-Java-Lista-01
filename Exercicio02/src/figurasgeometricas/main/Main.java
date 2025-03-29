package figurasgeometricas.main;

import figurasgeometricas.excecoes.ConeInvalidoException;
import figurasgeometricas.excecoes.CuboInvalidoException;
import figurasgeometricas.excecoes.RaioInvalidoException;
import figurasgeometricas.excecoes.RetanguloInvalidoException;
import figurasgeometricas.excecoes.TrianguloInvalidoException;
import figurasgeometricas.figuras.Circulo;
import figurasgeometricas.figuras.Cone;
import figurasgeometricas.figuras.Cubo;
import figurasgeometricas.figuras.Esfera;
import figurasgeometricas.figuras.Retangulo;
import figurasgeometricas.figuras.Triangulo;

public class Main {

	public static void main(String[] args) {
		try {
			
			
			Circulo circulo1 = new Circulo(12);
			//Circulo circulo2 = new Circulo(0);
			Esfera esfera1 = new Esfera(12);
			//Esfera esfera2 = new Esfera(0);
			Retangulo retangulo1 = new Retangulo(10,5);
			//Retangulo retangulo2 = new Retangulo(5,5);
			Cubo cubo1 = new Cubo(5);
			//Cubo cubo2 = new Cubo(0);
			Triangulo triangulo1 = new Triangulo(8, 8, 8);
			Triangulo triangulo2 = new Triangulo(5, 10, 5);
			Triangulo triangulo3 = new Triangulo(9,14,7);
			//Triangulo triangulo4 = new Triangulo(0, 5, 5);
			Cone cone1 = new Cone(3,10);
			//Cone cone2 = new Cone(0,0);
			
			//circulo1.exibirDetalhes();
			//esfera1.exibirDetalhes();
			//retangulo1.exibirDetalhes();
			//cubo1.exibirDetalhes();
			//triangulo1.exibirDetalhes();
			//triangulo2.exibirDetalhes();
			//triangulo3.exibirDetalhes();
			//cone1.exibirDetalhes();
			
			
		} catch (RaioInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CuboInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RetanguloInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TrianguloInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConeInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
