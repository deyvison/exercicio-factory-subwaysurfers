package ufpb.aps.gerenciador;

import ufpb.aps.factory.SubwaySurfersFactory;

public class SubwaySurfersGerenciador {
	
	
	public void montarJogo(SubwaySurfersFactory factory){
		
		factory.criarPersonagem();
		factory.criarGuarda();
		factory.criarMetro();
		factory.criarMoeda();
		factory.criarPaisagem();
		
	}
}
