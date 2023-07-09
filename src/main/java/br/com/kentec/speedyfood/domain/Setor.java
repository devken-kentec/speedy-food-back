package br.com.kentec.speedyfood.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="setor")
@SuppressWarnings("serial")
public class Setor implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = false, length = 200)
	private String nome;
	
	@Column(name="regiao", nullable = false, length = 100)
	private String regiao;
	
	public Setor() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "Setor [id=" + id + ", nome=" + nome + ", regiao=" + regiao + "]";
	}
}
