package PadroesProjeto.FactorySala.sofa;

import PadroesProjeto.FactorySala.Model.Movel;
import PadroesProjeto.FactorySala.Model.MovelFactory;

public class Sofa_ModernoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new SofaModerno();
	}

}

