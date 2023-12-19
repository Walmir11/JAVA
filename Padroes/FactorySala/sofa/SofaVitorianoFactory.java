package PadroesProjeto.FactorySala.sofa;

import PadroesProjeto.FactorySala.Model.Movel;
import PadroesProjeto.FactorySala.Model.MovelFactory;

public class SofaVitorianoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new SofaVitoriano();

	}

}
