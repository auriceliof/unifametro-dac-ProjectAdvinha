package entities;

import java.io.Serializable;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jogo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	
	@Column(name = "num_jogador")
	private Integer numJogador;
	
	@Column(name = "num_aleatorio1")
	private Integer numAleatorio1;
	

	@Column(name = "num_aleatorio2")
	private Integer numAleatorio2;
	

	@Column(name = "num_aleatorio3")
	private Integer numAleatorio3;
	

	@Column(name = "num_aleatorio4")
	private Integer numAleatorio4;
	

	@Column(name = "num_aleatorio5")
	private Integer numAleatorio5;
	
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getNumJogador() {
		return numJogador;
	}
	public void setNumJogador(Integer numJogador) {
		this.numJogador = numJogador;
	}
	public Integer getNumAleatorio1() {
		return numAleatorio1;
	}
	public void setNumAleatorio1(Integer numAleatorio1) {
		this.numAleatorio1 = numAleatorio1;
	}
	public Integer getNumAleatorio2() {
		return numAleatorio2;
	}
	public void setNumAleatorio2(Integer numAleatorio2) {
		this.numAleatorio2 = numAleatorio2;
	}
	public Integer getNumAleatorio3() {
		return numAleatorio3;
	}
	public void setNumAleatorio3(Integer numAleatorio3) {
		this.numAleatorio3 = numAleatorio3;
	}
	public Integer getNumAleatorio4() {
		return numAleatorio4;
	}
	public void setNumAleatorio4(Integer numAleatorio4) {
		this.numAleatorio4 = numAleatorio4;
	}
	public Integer getNumAleatorio5() {
		return numAleatorio5;
	}
	public void setNumAleatorio5(Integer numAleatorio5) {
		this.numAleatorio5 = numAleatorio5;
	}	
}
