package PadroesProjeto.Factory.Objeto;

import PadroesProjeto.Factory.Interface.Produto;

public class ProdutoB implements Produto {

	@Override
	public void criar() {
		System.out.println("Produto B criado");
	}

}
