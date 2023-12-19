package PadroesProjeto.FactorySala.mesa;

import PadroesProjeto.FactorySala.Model.Movel;
import PadroesProjeto.FactorySala.Model.MovelFactory;

public class MesaModernaFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new MesaModerna();

	}

}

