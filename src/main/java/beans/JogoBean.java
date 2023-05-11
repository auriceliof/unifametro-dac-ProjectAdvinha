package beans;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import daos.JogoDao;
import entities.Jogo;
import utils.MessageUtil;

@ManagedBean
@ViewScoped
public class JogoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Jogo jogo = new Jogo();
	
	private List<Jogo> list;
	
	public String salvar() {
		try {	
			Random random = new Random();
			int minRandom = 1;
			int maxRandom = 10;
			
			jogo.setNumAleatorio1(minRandom + random.nextInt(maxRandom)); 
			jogo.setNumAleatorio2(minRandom + random.nextInt(maxRandom)); 
			jogo.setNumAleatorio3(minRandom + random.nextInt(maxRandom)); 
			jogo.setNumAleatorio4(minRandom + random.nextInt(maxRandom)); 
			jogo.setNumAleatorio5(minRandom + random.nextInt(maxRandom));
			jogo.setResultado(jogo.getResultado());
						
			JogoDao.salvar(jogo);
			
			MessageUtil.sucesso("Sucesso: ", "Jogo salvo com sucesso!");
			
			jogo = new Jogo();
			
		} catch(Exception e) {
			MessageUtil.erro("Erro: ", "Erro ao salvar o Jogo!");
		}	
		return null;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getList() {
		if (list == null) {
			list = JogoDao.listarTodos();
		}
		return list;
	}

	public void setList(List<Jogo> list) {
		this.list = list;
	}	
}
