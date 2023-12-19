package PadroesProjeto.Factory.Objeto;

import PadroesProjeto.Factory.Interface.Produto;

public class ProdutoA implements Produto {

	@Override
	public void criar() {
		System.out.println("Produto A criado");
		
	}

}
