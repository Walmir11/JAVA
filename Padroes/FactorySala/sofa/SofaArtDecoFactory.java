package PadroesProjeto.FactorySala.sofa;

import PadroesProjeto.FactorySala.Model.Movel;
import PadroesProjeto.FactorySala.Model.MovelFactory;

public class SofaArtDecoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new SofaArtDeco();

	}

}
