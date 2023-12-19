package PadroesProjeto.Factory.Objeto;

import PadroesProjeto.Factory.Interface.FabricaProdutoFactory;
import PadroesProjeto.Factory.Interface.Produto;

public class FabricaConcretaB implements FabricaProdutoFactory {
    @Override
    public Produto criarProduto() {
        return new ProdutoB();
    }
}
