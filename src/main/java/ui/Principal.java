package ui;

import java.util.List;
import java.util.Random;

import daos.JogoDao;
import entities.Jogo;

public class Principal {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		
		System.out.println("Início");

		Jogo j = new Jogo();
		j.setNome("Marcos");
		j.setNumJogador(5);
		j.setNumAleatorio1(random.nextInt(10)); 
		j.setNumAleatorio2(random.nextInt(10)); 
		j.setNumAleatorio3(random.nextInt(10)); 
		j.setNumAleatorio4(random.nextInt(10)); 
		j.setNumAleatorio5(random.nextInt(10)); 
					
		JogoDao.salvar(j);

		System.out.println(JogoDao.listarTodos());
		
		System.out.println("Fim");
		
		List<Jogo> listar = JogoDao.listarTodos();
		
		
		System.out.println(listar);
	}
}
