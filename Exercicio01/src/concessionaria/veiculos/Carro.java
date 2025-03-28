package concessionaria.veiculos;

public class Carro extends Veiculo {
	
	private int numPortas;

	public Carro(String marca,String modelo,int numPortas,int ano,double preco) {
		super(marca, modelo, ano, preco);
		this.numPortas = numPortas;
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	public void exibirDetalhesCarro() {
		exibirDetalhes();
		System.out.println("Numero de Portas: " + numPortas);
	}
}