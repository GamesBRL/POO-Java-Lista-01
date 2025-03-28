package concessionaria.veiculos;

public class Moto extends Veiculo {
	
	private int cilindradas;

	public Moto(String marca,String modelo,int cilindradas,int ano,double preco) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas() {
		return cilindradas;
	}
	
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public void exibirDetalhesMoto() {
		exibirDetalhes();
		System.out.println("Cilindradas: " + cilindradas);
	}
}
