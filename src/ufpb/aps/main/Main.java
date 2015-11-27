package ufpb.aps.main;

import ufpb.aps.factory.SubwaySurfersFactory;
import ufpb.aps.gerenciador.SubwaySurfersGerenciador;
import ufpb.aps.subway.brazil.SubwaySurfersBrazilFactory;
import ufpb.aps.subway.tokyo.SubwaySurfersTokyoFactory;

public class Main {
	
	public static void main(String[] args) {
		
		SubwaySurfersGerenciador jogo = new SubwaySurfersGerenciador();
		
		jogo.montarJogo(new SubwaySurfersBrazilFactory());
		jogo.montarJogo(new SubwaySurfersTokyoFactory());
		
	}
}
