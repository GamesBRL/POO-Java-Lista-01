package concessionaria.veiculos;

import concessionaria.excecoes.DescontoInvalidoException;
import concessionaria.interfaces.Desconto;

class Veiculo implements Desconto{
	
	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	
	public Veiculo(String marca, String modelo, int ano, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	protected void exibirDetalhes() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Preço: " + getPreco());
	}

	@Override
	public void aplicarDesconto(double porcentagem) throws DescontoInvalidoException{
		// TODO Auto-generated method stub
		if(porcentagem <= 100) {
			double descPreco = preco - (preco*(porcentagem/100));
			setPreco(descPreco);
			System.out.println("Novo preço com " + porcentagem + "% " + "de desconto: " + this.preco);
		}
		else {
			throw new DescontoInvalidoException();
		}
	}
}
