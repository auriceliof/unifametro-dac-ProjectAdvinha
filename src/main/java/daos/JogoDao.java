package daos;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Jogo;
import utils.JPAUtil;

public class JogoDao {
	
	Random random = new Random();

	public static void salvar(Jogo j) {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		em.getTransaction().begin();
		em.persist(j);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void deletar(Jogo j) {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		em.getTransaction().begin();
		j = em.find(Jogo.class, j.getId());
		em.remove(j);
		em.getTransaction().commit();
		em.close();
	}
	

	public static List<Jogo> listarTodos() {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		Query q = em.createQuery("select j from Jogo j");
		@SuppressWarnings("unchecked")
		List<Jogo> list = q.getResultList();
		em.close();
		return list;
	}
}
