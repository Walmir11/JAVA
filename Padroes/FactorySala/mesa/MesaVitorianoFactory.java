package PadroesProjeto.FactorySala.mesa;

import PadroesProjeto.FactorySala.Model.Movel;
import PadroesProjeto.FactorySala.Model.MovelFactory;

public class MesaVitorianoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new MesaCentroVitoriano();

	}

}

