package br.com.kentec.speedyfood.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="combo_produto")
@SuppressWarnings("serial")
public class ComboProduto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_combo_produto", nullable = false)
	private Combo combo = new Combo();
	
	@ManyToOne
	@JoinColumn(name="id_produto", nullable = false)
	private Produtos produto = new Produtos();
	
	public ComboProduto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Combo getCombo() {
		return combo;
	}

	public void setCombo(Combo combo) {
		this.combo = combo;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "ComboProduto [id=" + id + ", combo=" + combo + ", produto=" + produto + "]";
	}
}
