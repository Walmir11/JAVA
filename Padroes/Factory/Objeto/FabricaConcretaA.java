package PadroesProjeto.Factory.Objeto;

import PadroesProjeto.Factory.Interface.FabricaProdutoFactory;
import PadroesProjeto.Factory.Interface.Produto;

public class FabricaConcretaA implements FabricaProdutoFactory {

	@Override
	public Produto criarProduto() {
		return new ProdutoA();
	}
}
