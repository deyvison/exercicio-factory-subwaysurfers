package ufpb.aps.subway.tokyo;


import ufpb.aps.factory.SubwaySurfersFactory;
import ufpb.aps.factory.SubwaySurfersGuarda;
import ufpb.aps.factory.SubwaySurfersMetro;
import ufpb.aps.factory.SubwaySurfersMoeda;
import ufpb.aps.factory.SubwaySurfersPaisagem;
import ufpb.aps.factory.SubwaySurfersPersonagem;

public class SubwaySurfersTokyoFactory implements SubwaySurfersFactory {
	
	
	private static SubwaySurfersTokyoFactory singleton;
	
	private SubwaySurfersTokyoFactory(){};

	public static SubwaySurfersFactory getInstance() {
		
		if(singleton == null)
			singleton = new SubwaySurfersTokyoFactory();
		
		return singleton;
	}

	@Override
	public SubwaySurfersPersonagem criarPersonagem() {
		return new SubwaySurfersTokyoPersonagem();
	}

	@Override
	public SubwaySurfersMetro criarMetro() {
		return new SubwaySurfersTokyoMetro();
	}

	@Override
	public SubwaySurfersGuarda criarGuarda() {
		return new SubwaySurfersTokyoGuarda();
	}

	@Override
	public SubwaySurfersMoeda criarMoeda() {
		return new SubwaySurfersTokyoMoeda();
	}

	@Override
	public SubwaySurfersPaisagem criarPaisagem() {
		return new SubwaySurfersTokyoPaisagem();
	}

	

	

}
