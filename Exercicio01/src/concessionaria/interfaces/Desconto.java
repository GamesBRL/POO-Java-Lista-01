package concessionaria.interfaces;

import concessionaria.excecoes.DescontoInvalidoException;

public interface Desconto {
	void aplicarDesconto(double porcentagem) throws DescontoInvalidoException;
}