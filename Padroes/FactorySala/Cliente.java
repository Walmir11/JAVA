package PadroesProjeto.FactorySala;

import PadroesProjeto.FactorySala.cadeira.CadeiraModernaFactory;
import PadroesProjeto.FactorySala.mesa.MesaArtDecoFactory;
import PadroesProjeto.FactorySala.sofa.SofaVitorianoFactory;

public class Cliente {

	public static void main(String[] args) {
		CadeiraModernaFactory cadeira = new CadeiraModernaFactory();
		SofaVitorianoFactory sofa =  new SofaVitorianoFactory();
		MesaArtDecoFactory mesa = new MesaArtDecoFactory();
		
		cadeira.createMovel().descricao();
		sofa.createMovel().descricao();
		mesa.createMovel().descricao();
		

	}

}
