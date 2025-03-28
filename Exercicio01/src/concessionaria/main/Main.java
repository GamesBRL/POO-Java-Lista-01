package concessionaria.main;

import concessionaria.excecoes.DescontoInvalidoException;
import concessionaria.veiculos.Carro;
import concessionaria.veiculos.Moto;

public class Main {

	public static void main(String[] args){
		Carro c1 = new Carro("bmw", "ixm600", 4, 2024, 1143950);
		Moto m1 = new Moto("harley davidson", "heritage classic", 1923, 2025, 139950);
		
		try {
			//c1.exibirDetalhesCarro();
			//c1.aplicarDesconto(110);
			c1.aplicarDesconto(100);
			//System.out.println("Portas do carro: " + c1.getNumPortas());
			
			//m1.exibirDetalhesMoto();
			//m1.aplicarDesconto(110);
			System.out.println("Cilindradas: " + m1.getCilindradas());
			
			
			
			
		} catch (DescontoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
