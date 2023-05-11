package beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import daos.JogoDao;
import entities.Jogo;

@ManagedBean
@ViewScoped
public class JogoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Jogo jogo = new Jogo();
	
	private List<Jogo> list;
	
	public String salvar() {			
		JogoDao.salvar(jogo);
		jogo = new Jogo();
	
		return null;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getList() {
		return list;
	}

	public void setList(List<Jogo> list) {
		this.list = list;
	}	
}
