package ui;

import java.util.Random;

import daos.JogoDao;
import entities.Jogo;

public class Principal {
	public static void main(String[] args) {
		
		Random random = new Random();
		int minRandom = 1;
		int maxRandom = 10;
		
		
		Jogo jogo = new Jogo();
		
		jogo.setJogador("Teste2");
		jogo.setNumJogador(7);
				
		jogo.setNumAleatorio1(minRandom + random.nextInt(maxRandom)); 
		jogo.setNumAleatorio2(minRandom + random.nextInt(maxRandom)); 
		jogo.setNumAleatorio3(minRandom + random.nextInt(maxRandom)); 
		jogo.setNumAleatorio4(minRandom + random.nextInt(maxRandom)); 
		jogo.setNumAleatorio5(minRandom + random.nextInt(maxRandom));
		jogo.setResultado(jogo.getResultado());
					
		JogoDao.salvar(jogo);
	}
}
