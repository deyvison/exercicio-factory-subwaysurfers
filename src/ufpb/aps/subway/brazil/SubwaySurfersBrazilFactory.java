package ufpb.aps.subway.brazil;

import ufpb.aps.factory.SubwaySurfersGuarda;
import ufpb.aps.factory.SubwaySurfersMetro;
import ufpb.aps.factory.SubwaySurfersMoeda;
import ufpb.aps.factory.SubwaySurfersPaisagem;
import ufpb.aps.factory.SubwaySurfersPersonagem;
import ufpb.aps.factory.SubwaySurfersFactory;

public class SubwaySurfersBrazilFactory implements SubwaySurfersFactory {

	private static SubwaySurfersBrazilFactory singleton;
	
	private SubwaySurfersBrazilFactory(){};
	
	public static SubwaySurfersFactory getInstance() {
		
		if(singleton == null)
			singleton = new SubwaySurfersBrazilFactory();
		
		return singleton;
	}

	@Override
	public SubwaySurfersPersonagem criarPersonagem() {
		return new SubwaySurfersBrazilPersonagem();
	}

	@Override
	public SubwaySurfersMetro criarMetro() {
		return new SubwaySurfersBrazilMetro();
	}

	@Override
	public SubwaySurfersGuarda criarGuarda() {
		return new SubwaySurfersBrazilGuarda();
	}

	@Override
	public SubwaySurfersMoeda criarMoeda() {
		return new SubwaySurfersBrazilMoeda();
	}

	@Override
	public SubwaySurfersPaisagem criarPaisagem() {
		return new SubwaySurfersBrazilPaisagem();
	}

	

}
