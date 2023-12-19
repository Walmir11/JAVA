package PadroesProjeto.FactorySala.cadeira;

import PadroesProjeto.FactorySala.Model.Movel;
import PadroesProjeto.FactorySala.Model.MovelFactory;

public class CadeiraVitorianoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new CadeiraVitoriano();

	}

}
